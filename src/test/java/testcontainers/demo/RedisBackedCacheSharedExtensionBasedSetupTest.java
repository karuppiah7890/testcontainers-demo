package testcontainers.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedisBackedCacheSharedExtensionBasedSetupTest {
    private RedisBackedCache underTest;

    @RegisterExtension
    static SharedRedisExtension sharedRedisExtension = new SharedRedisExtension();

    @BeforeEach
    public void setUp() {
        String address = sharedRedisExtension.getHost();
        Integer port = sharedRedisExtension.getPort();

        // Now we have an address and port for Redis, no matter where it is running
        underTest = new RedisBackedCache(address, port);
    }

    @Test
    void testSimplePutAndGet() {
        underTest.put("test", "example");

        String retrieved = underTest.get("test");
        assertEquals("example", retrieved);
    }

    @Test
    void anotherTestForSimplePutAndGet() {
        underTest.put("test", "anotherExample");

        String retrieved = underTest.get("test");
        assertEquals("anotherExample", retrieved);
    }
}
