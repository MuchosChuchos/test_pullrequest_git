package com.example.test_pullrequest_git;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("qq")
public class JustController {

    @GetMapping
    protected ResponseEntity<?> tempasas() {
        return new ResponseEntity<>(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

}
