package org.mvnsearch.redis.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis operation test
 *
 * @author linux_china
 */
@SpringBootTest
public class RedisOperationTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void setKV() {
        redisTemplate.opsForValue().set("nick", "jackie");
    }

    @Test
    public void opsForStream() {

    }
}
