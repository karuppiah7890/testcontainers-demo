package testcontainers.demo;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SharedRedisExtension implements Extension, BeforeAllCallback, AfterAllCallback {
    final RedisContainer redisContainer =
            new RedisContainer("redis:5.0.3-alpine");

    @Override
    public void beforeAll(ExtensionContext context) {
        redisContainer.start();
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        redisContainer.stop();
    }

    String getHost() {
        return redisContainer.getHost();
    }

    Integer getPort() {
        return redisContainer.getPort();
    }

    String getContainerID() {
        return redisContainer.getContainerId();
    }
}
