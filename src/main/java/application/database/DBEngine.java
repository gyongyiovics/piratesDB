package application.database;

import java.sql.*;
import java.util.Properties;

public class DBEngine {
    private Connection connection;

    public DBEngine(){
        connection = connect();
    }

    public Boolean isConnected() {
        return (connection != null);
    }

    //make connection
    public Connection connect() {
        String jdbc = "jdbc:mysql://localhost:3306/";
        String dbName = "pirateDB";
        String rest = "?useUnicode=yes&characterEncoding=UTF-8";
        String url = jdbc + dbName + rest;
        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
