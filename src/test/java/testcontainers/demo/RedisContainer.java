package testcontainers.demo;

import org.testcontainers.containers.GenericContainer;

public class RedisContainer extends GenericContainer<RedisContainer> {
    public static final int REDIS_PORT = 6379;

    public RedisContainer(String dockerImageName) {
        super(dockerImageName);
        addExposedPort(REDIS_PORT);
    }

    Integer getPort() {
        return this.getMappedPort(REDIS_PORT);
    }
}
