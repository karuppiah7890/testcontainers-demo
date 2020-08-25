package testcontainers.demo;

import redis.clients.jedis.Jedis;

public class RedisBackedCache {
    private final Jedis jedis;

    public RedisBackedCache(String redisHost, int port) {
        this.jedis = new Jedis(redisHost, port);
    }

    public String put(String key, String value) {
        return jedis.set(key, value);
    }

    public String get(String key) {
        return jedis.get(key);
    }
}
