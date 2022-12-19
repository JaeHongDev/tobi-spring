package com.example.rechapter1.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/springbook","root","1234");
    }
}
