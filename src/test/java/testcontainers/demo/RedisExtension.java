package testcontainers.demo;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RedisExtension implements Extension, BeforeAllCallback {
    final RedisContainer redisContainer =
            new RedisContainer("redis:5.0.3-alpine");

    @Override
    public void beforeAll(ExtensionContext context) {
        redisContainer.start();
    }

    String getHost() {
        return redisContainer.getHost();
    }

    Integer getPort() {
        return redisContainer.getPort();
    }
}
