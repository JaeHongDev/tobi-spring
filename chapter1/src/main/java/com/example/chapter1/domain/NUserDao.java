package com.example.chapter1.domain;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao {
    private final ConnectionMaker connectionMaker;

    public NUserDao() {
        this.connectionMaker= new DConnectionMaker();
    }

    public void add(User user) throws ClassNotFoundException, SQLException{
        Connection connection = connectionMaker.makeConnection();

    }

}
