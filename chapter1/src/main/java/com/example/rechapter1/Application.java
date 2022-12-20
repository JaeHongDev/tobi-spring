package com.example.rechapter1;

import com.example.rechapter1.domain.NUserDao;
import com.example.rechapter1.domain.User;
import com.example.rechapter1.domain.UserDao;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String ...args) throws SQLException, ClassNotFoundException {

        SpringApplication.run(Application.class,args);
    }
}
