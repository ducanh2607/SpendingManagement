package DAO;

import connection.MyConnection;
import model.User;

import javax.jws.soap.SOAPBinding;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection;
    private final String SELECT_ALL_USER = "select * from user;";
    private final String SELECT_USER_BY_ID = "select * from user where id = ?";
    private final String INSERT_USER = "insert into user(userName, password) values (?,?);";
    private final String UPDATE_USER = "update user set userName = ?, password = ?, name = ? where id = ?";
    private final String DELETE_USER = "delete from user where id = ?";
    private final String BLOCK_USER = "update user set status = ? where id = ?";
    public UserDAO(){
        connection = MyConnection.getConnection();
    }
    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER)){
            getListUser(users, preparedStatement);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    private void getListUser(List<User> users, PreparedStatement preparedStatement) throws SQLException{
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String userName = resultSet.getString("userName");
            String password = resultSet.getString("password");
            users.add(new User(id, name, userName, password));
        }
    }
    public User findUserById(Long id){
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)){
            preparedStatement.setLong(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                return new User(id, name, userName, password);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public boolean createUser(User user){
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)){
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateUser(User user){
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setLong(4, user.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteUser(Long id){
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)){
            preparedStatement.setLong(1, id);
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  false;
    }
    public boolean blockUser(Long id){
        try (PreparedStatement preparedStatement = connection.prepareStatement(BLOCK_USER)){
            preparedStatement.setBoolean(1, findUserById(id).isStatus());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

}
