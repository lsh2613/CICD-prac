package com.cicdprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @Autowired
    private final MyService myService;

    public Controller(MyService myService) {
        this.myService = myService;
    }

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

    @GetMapping("/code-rabbit-ai")
    public String coderabbitai() {
        return "code-rabbit=ai is success!";
    }

    @GetMapping("/api")
    public String api() {
        return myService.api();
    }

}
