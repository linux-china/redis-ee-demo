package org.mvnsearch.redis.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mvnsearch.microservices.annotator.RemoteAccess;
import redis.clients.jedis.Jedis;

public class JedisTest {
    @RemoteAccess("redis")
    private static Jedis jedis;

    @BeforeAll
    public static void setUp() {
        jedis = new Jedis("localhost", 6379);
    }

    @AfterAll
    public static void tearDown() {
        jedis.close();
    }

    @Test
    public void testOperation() {
        jedis.set("nick", "jackie");
        final String nick = jedis.get("nick");
        System.out.println(nick);
    }
}
