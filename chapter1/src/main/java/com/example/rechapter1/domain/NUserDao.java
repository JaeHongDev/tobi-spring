package com.example.rechapter1.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NUserDao implements ConnectionMaker{
    public Connection getConnection() throws SQLException {
     //       return DriverManager.getConnection("jdbc:mysql://localhost/springbook","root","1234");
        return null;
    }

    @Override
    public Connection makeConnection() throws SQLException {
        return null;
    }
}
