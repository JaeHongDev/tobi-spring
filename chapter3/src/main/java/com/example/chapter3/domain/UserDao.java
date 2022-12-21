package com.example.chapter3.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    public int getCount() throws SQLException {
        Connection connection= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection = this.connectionMaker.makeConnection();
            ps = connection.prepareStatement("select count(*) from user");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        }catch (Exception e){
            throw e;
        }finally {
            if(ps != null){
                try{
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    public void deleteAll() throws SQLException {
        Connection connection= null;
        PreparedStatement ps = null;
        try{
            connection = this.connectionMaker.makeConnection();
            ps = new DeleteAllStatement().makePreparedStatement(connection);
        }catch (Exception e){
           throw e;
        }finally {
            if(ps != null){
                try{
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }

}
