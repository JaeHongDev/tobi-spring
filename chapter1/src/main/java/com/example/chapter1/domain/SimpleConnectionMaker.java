package com.example.chapter1.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("dbc:mysql://localhost/springbook","root","1234");
        return connection;
    }
}
