package com.cicdprac;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String api() {
        return "API is success!";
    }
}