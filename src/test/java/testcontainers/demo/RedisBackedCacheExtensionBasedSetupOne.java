package testcontainers.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedisBackedCacheExtensionBasedSetupOne {
    private RedisBackedCache underTest;

    @RegisterExtension
    static RedisExtension redisExtension = new RedisExtension();

    @BeforeEach
    public void setUp() {
        String address = redisExtension.getHost();
        Integer port = redisExtension.getPort();

        // Now we have an address and port for Redis, no matter where it is running
        underTest = new RedisBackedCache(address, port);
    }

    @Test
    void testSimplePutAndGet() {
        underTest.put("test", "example");

        String retrieved = underTest.get("test");
        assertEquals("example", retrieved);
    }
}
