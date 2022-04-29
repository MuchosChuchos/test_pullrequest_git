package com.example.test_pullrequest_git;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("qq")
public class NotJustAController {

    @DeleteMapping
    public String gelete() {
        return "deleted";
    }

    @PutMapping("create")
    public HttpStatus create() {
        return HttpStatus.CREATED;
    }

}
