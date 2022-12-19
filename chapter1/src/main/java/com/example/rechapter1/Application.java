package com.example.rechapter1;

import com.example.rechapter1.domain.User;
import com.example.rechapter1.domain.UserDao;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String ...args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        var user = new User();
        user.setId("id");
        user.setPassword("password");
        user.setName("name");
        userDao.add(user);

        SpringApplication.run(Application.class,args);
    }
}
