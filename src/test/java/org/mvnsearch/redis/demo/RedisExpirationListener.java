package org.mvnsearch.redis.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisPubSub;

public class RedisExpirationListener {
    public static void main(String[] args) {
        try (JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost", 16379)) {
            Jedis jedis = pool.getResource();
            System.out.println("Begin to listen");
            jedis.psubscribe(new KeyExpiredListener(), "__key*__:*");
        }
    }

    public static class KeyExpiredListener extends JedisPubSub {
        @Override
        public void onPSubscribe(String pattern, int subscribedChannels) {
            System.out.println("onPSubscribe " + pattern + " " + subscribedChannels);
        }

        @Override
        public void onPMessage(String pattern, String channel, String message) {
            System.out.println("onPMessage pattern " + pattern + " " + channel + " " + message);
        }

    }
}
