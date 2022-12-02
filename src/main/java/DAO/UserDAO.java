package DAO;

import connection.MyConnection;

import java.sql.Connection;

public class UserDAO {
    private Connection connection;
    private final String SELECT_ALL_USER = "select * from user;";
    private final String SELECT_USER_BY_ID = "select * from user where id = ?";
    private final String INSERT_USER = "insert into user(userName, password) values (?,?);";
    private final String UPDATE_USER = "update user set userName = ?, password = ?, name = ? where id = ?";
    private final String DELETE_USER = "delete from user where id = ?";
    private final String LOCK_USER = "update user set status = ? where id = ?";
    public UserDAO(){
        connection = MyConnection.getConnection();
    }
}
