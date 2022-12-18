package com.example.chapter1.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class UserDaoTest {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
    }

}