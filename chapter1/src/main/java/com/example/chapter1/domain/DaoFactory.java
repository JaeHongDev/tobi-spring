package com.example.chapter1.domain;

import java.sql.SQLException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() throws SQLException, ClassNotFoundException {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return new UserDao(connectionMaker);
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
