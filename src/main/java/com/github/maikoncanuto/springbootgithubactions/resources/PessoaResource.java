package com.github.maikoncanuto.springbootgithubactions.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaResource {

    @Value("${maven.application.name:not_found}")
    private String applicationName;

    @Value("${maven.application.version:not_found}")
    private String applicationVersion;

    @GetMapping("/version")
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok(String.format("Version: %s, Name: %s", applicationVersion, applicationName));
    }

}
