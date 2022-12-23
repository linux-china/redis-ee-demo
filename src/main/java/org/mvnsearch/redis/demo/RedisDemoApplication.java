package org.mvnsearch.redis.demo;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@SpringBootApplication
@EnableRedisDocumentRepositories
public class RedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
    }

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(RedisProperties redisProperties) {
        final RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(redisProperties.getHost(), redisProperties.getPort());
        configuration.setDatabase(redisProperties.getDatabase());
        return new JedisConnectionFactory(configuration);
    }
}
