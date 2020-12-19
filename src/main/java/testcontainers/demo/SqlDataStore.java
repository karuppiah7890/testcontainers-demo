package testcontainers.demo;

import java.sql.*;

public class SqlDataStore {
    String jdbcUrl;

    public SqlDataStore(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    int runDummyQuery() throws SQLException {
        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             Statement st = conn.createStatement();) {
            ResultSet rs = st.executeQuery("SELECT 1 as some_value");
            if (rs.next()) {
                return rs.getInt(1);
            }
            rs.close();
        }
        return 0;
    }

}
