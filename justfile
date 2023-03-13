redis_ee:
   redis-cli -p 16379

expired_test:
   redis-cli -p 16379 SET vip.user.1 jackie
   redis-cli -p 16379 EXPIRE vip.user.1 10
