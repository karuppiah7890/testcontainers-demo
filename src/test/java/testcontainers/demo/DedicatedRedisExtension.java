package testcontainers.demo;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;

public class DedicatedRedisExtension implements Extension, BeforeEachCallback, AfterEachCallback {
    final RedisContainer redisContainer =
            new RedisContainer("redis:5.0.3-alpine");

    String getHost() {
        return redisContainer.getHost();
    }

    Integer getPort() {
        return redisContainer.getPort();
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        redisContainer.start();
    }

    public String getContainerID() {
        return redisContainer.getContainerId();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        redisContainer.stop();
    }
}
