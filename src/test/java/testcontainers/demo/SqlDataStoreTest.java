package testcontainers.demo;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SqlDataStoreTest {
    @Test
    void runDummyQuery() throws SQLException {
        SqlDataStore sqlDataStore = new SqlDataStore("jdbc:postgresql://localhost/postgres");
        int result = sqlDataStore.runDummyQuery();
        assertEquals(1, result);
    }
}