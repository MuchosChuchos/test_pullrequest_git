package com.example.test_pullrequest_git;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("qq")
public class JustController {

    @GetMapping("/temp")
    public String getTemp() {
        return "na temp";
    }

}
