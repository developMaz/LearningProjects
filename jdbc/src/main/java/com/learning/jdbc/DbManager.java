package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection connection;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "test");
        connectionProperties.put("password", "testing_app");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Warsaw"
                + "&useSSL=False", connectionProperties);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return connection;
    }
}
