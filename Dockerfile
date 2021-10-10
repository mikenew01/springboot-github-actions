FROM maven:3.8.3-jdk-11-slim as builder
WORKDIR /app
COPY . .
RUN ["mvn", "-T 1.5C", "clean", "install"]

FROM openjdk:11-slim as runtime
WORKDIR /app
COPY --from=builder /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

