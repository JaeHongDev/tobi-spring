package com.example.chapter3.domain;

import java.sql.Connection;

public interface ConnectionMaker {
    Connection makeConnection();
}
