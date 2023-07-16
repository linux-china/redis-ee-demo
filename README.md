Redis Demo with Redis Stack
===============================

RedisInsight: a visualization tool for understanding and optimizing Redis data.

# Modules

* RedisJSON
* RediSearch 
* RedisGraph
* RedisTimeSeries
* RedisBloom

![Redis Stack](redis-stack.png)
            
# Expired Keys listener

* Enable expired events on keys: `redis-cli config set notify-keyspace-events Ex` 
* Modify `redis.conf` and add `notify-keyspace-events Ex`

# References
       
* Redis Stack: https://redis.io/docs/stack/ https://github.com/redis-stack/redis-stack
* Hello, Redis Stack: https://redis.com/blog/introducing-redis-stack/
* Redis OM Spring: https://redis.io/docs/stack/get-started/tutorials/stack-spring/ https://github.com/redis/redis-om-spring
* Redis Streams: https://redis.io/topics/streams-intro
* A first look at Redis Streams and how to use them with Java: https://www.javacodegeeks.com/2018/05/a-first-look-at-redis-streams-and-how-to-use-them-with-java.html
* Spring Data Redis: https://docs.spring.io/spring-data/redis/docs/current/reference/html/
* Lettuce Reactive API: https://github.com/lettuce-io/lettuce-core/wiki/Reactive-API
* Redis Explained: https://architecturenotes.co/redis/
* How to use Redis as a job scheduler: https://medium.com/@hectortav/how-to-use-redis-as-a-job-scheduler-49e85d2d778
* Redis OM Spring Demo - Vector Similarity Search: https://github.com/redis/redis-om-spring/tree/main/demos/roms-vss

