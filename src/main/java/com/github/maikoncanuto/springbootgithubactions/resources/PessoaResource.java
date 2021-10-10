package com.github.maikoncanuto.springbootgithubactions.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaResource {

    @GetMapping(name = "/pessoas/version")
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok("1.0.0");
    }

}
