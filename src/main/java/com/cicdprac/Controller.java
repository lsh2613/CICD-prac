package com.cicdprac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/test")
    public String test() {
        return "This is a test page";
    }
}
