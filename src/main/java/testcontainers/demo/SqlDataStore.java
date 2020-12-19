package testcontainers.demo;

import java.sql.*;
import java.util.Properties;

public class SqlDataStore {
    String jdbcUrl;
    private final String username;
    private final String password;

    public SqlDataStore(String jdbcUrl, String username, String password) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
    }

    int runDummyQuery() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", username);
        props.setProperty("password", password);

        try (Connection conn = DriverManager.getConnection(jdbcUrl, props);
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
