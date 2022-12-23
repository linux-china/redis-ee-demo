package org.mvnsearch.redis.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {
    private static Jedis jedis;

    @BeforeAll
    public static void setUp() {
        jedis = new Jedis("localhost", 16379);
    }

    @AfterAll
    public static void tearDown() {
        jedis.close();
    }

    @Test
    public void testOperation() {
        jedis.set("nick", "jackie");
        System.out.println(jedis.get("nick"));
    }
}
