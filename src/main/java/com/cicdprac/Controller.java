package com.cicdprac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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

    @GetMapping("/time")
    public String time() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/ci-cd")
    public String cicd() {
        return "CICD is success!";
    }

    @GetMapping("/coderabbitai")
    public String coderabbitai() {
        return "coderabbitai is success!";
    }
}
