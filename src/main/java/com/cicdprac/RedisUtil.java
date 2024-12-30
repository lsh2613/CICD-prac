package com.cicdprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    @Autowired
    private final RedisTemplate<String, Long> refreshTokenTemplate;

    public RedisUtil(RedisTemplate<String, Long> refreshTokenTemplate) {
        this.refreshTokenTemplate = refreshTokenTemplate;
    }

    public Long getValue(String key) {
        return refreshTokenTemplate.opsForValue().get(key);
    }
}
