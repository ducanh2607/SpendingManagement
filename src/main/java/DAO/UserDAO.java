package DAO;

import connection.MyConnection;
import model.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection;
    private final String SELECT_ALL_USERS = "select * from users;";
    private final String SELECT_USER_BY_ID = "select * from users where id_user = ?;";
    private final String INSERT_USER = "insert into users(name_user, user_name , password) value (?,?,?);";
    private final String UPDATE_USER = "update users set user_name = ?, password = ?, name_user = ? where id_user = ?;";
    private final String DELETE_USER = "delete from users where id_user = ?;";
    private final String LOCK_USER = "update users set status = ? where id_user = ?;";

    public UserDAO() {
        connection = MyConnection.getConnection();
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)) {
            getListUser(users, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    public User findById(Long id){
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)){
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                return new User(name, userName, password);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean createUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassword());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateUser(User user){
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)){
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setLong(4, user.getId());
            return  preparedStatement.executeUpdate() > 0;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteById(Long id){
       try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)){
           preparedStatement.setLong(1,id);
           return preparedStatement.executeUpdate() > 0;
       }catch (SQLException e){
           e.printStackTrace();
       }
       return false;
    }
    public boolean blockUser(Long id){
        Boolean status = true;
        try (PreparedStatement preparedStatement = connection.prepareStatement(LOCK_USER)){
            preparedStatement.setBoolean(1, true);
            preparedStatement.setLong(2,id);
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;

    }



    private void getListUser(List<User> users, PreparedStatement preparedStatement)
            throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Long id = Long.parseLong(resultSet.getString("id"));
            String name = resultSet.getString("name");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            users.add(new User(id, name, username, password));
        }
    }
}
