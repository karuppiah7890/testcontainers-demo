package testcontainers.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RedisBackedCacheDedicatedExtensionBasedSetupTest {
    private RedisBackedCache underTest;

    @RegisterExtension
    static DedicatedRedisExtension dedicatedRedisExtension = new DedicatedRedisExtension();

    @BeforeEach
    public void setUp() {
        String address = dedicatedRedisExtension.getHost();
        Integer port = dedicatedRedisExtension.getPort();

        System.out.println(dedicatedRedisExtension.getContainerID());

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
        String retrieved = underTest.get("test");
        assertNull(retrieved);

        underTest.put("test", "anotherExample");

        retrieved = underTest.get("test");
        assertEquals("anotherExample", retrieved);
    }
}
