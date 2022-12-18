package com.example.chapter1;

import com.example.chapter1.domain.User;
import com.example.chapter1.domain.UserDao;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(Chapter1Application.class, args);
    }

}
