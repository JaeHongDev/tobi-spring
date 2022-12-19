package com.example.rechapter1.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException {
        // 독자적으로 커넥션을 만드는 방법
        return null;
    }
}
