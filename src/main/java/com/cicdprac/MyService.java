package com.cicdprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private final RedisUtil redisUtil;

    public MyService(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    public String api() {
        return "API is success!";
    }

    public Long redis() {
        return redisUtil.getValue("key");
    }
}
