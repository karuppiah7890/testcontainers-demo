package testcontainers.demo;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testcontainers
class SqlDataStoreTest {

    @Container
    PostgreSQLContainer<?> postgreSQLContainer =
            new PostgreSQLContainer<>("postgres:13-alpine")
                    .withUsername("karuppiah")
                    .withPassword("password")
                    .withDatabaseName("demo");

    @Test
    void runDummyQuery() throws SQLException {
        SqlDataStore sqlDataStore =
                new SqlDataStore(postgreSQLContainer.getJdbcUrl(),
                        postgreSQLContainer.getUsername(),
                        postgreSQLContainer.getPassword());
        int result = sqlDataStore.runDummyQuery();
        assertEquals(1, result);
    }
}