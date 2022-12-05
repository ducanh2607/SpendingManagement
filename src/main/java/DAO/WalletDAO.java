package DAO;

import connection.MyConnection;
import model.Category;
import model.User;
import model.WalletManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WalletDAO {
    private final Connection connection;
    private final UserDAO userDAO;
    private final CategoryDAO categoryDAO;
    private final String SELECT_ALL_WALLET = "select * from walletmanagement;";
    private final String SELECT_WALLET_BY_ID = "select * from walletmanagement where id = ?;";
    private final String INSERT_WALLET = "insert into walletmanagement(type, money,notes,id_category,id_user) value (?,?,?,?,?);";
    private final String UPDATE_WALLET = "update walletmanagement set money = ?, notes = ?, id_category = ? where id = ?;";
    private final String DELETE_WALLET = "delete from walletmanagement where id = ?;";

    public WalletDAO() {
        connection = MyConnection.getConnection();
        userDAO = new UserDAO();
        categoryDAO = new CategoryDAO();
    }


    public List<WalletManagement> findAll() {
        List<WalletManagement> walletManagements = new ArrayList<>();
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement(SELECT_ALL_WALLET)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Boolean type = resultSet.getBoolean("type");
                Double money = resultSet.getDouble("money");
                Integer quantity = resultSet.getInt("quantity");
                Long categoryId = resultSet.getLong("id_category");
                Long userId = resultSet.getLong("id_user");
                Category category = categoryDAO.findCategoryById(categoryId);
               //  products.add(new Product(id, name, price, quantity, category));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return walletManagements;
    }
    public boolean createWallet(WalletManagement walletManagement) {
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_WALLET)) {
            preparedStatement.setBoolean(1, walletManagement.isType());
            preparedStatement.setDouble(2, walletManagement.getMoney());
            preparedStatement.setString(3,walletManagement.getNotes());
            preparedStatement.setLong(4, walletManagement.getCategory().getId());
            preparedStatement.setLong(5, walletManagement.getUser().getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public WalletManagement findWalletById(Long id) {
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement(SELECT_WALLET_BY_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Boolean type  = resultSet.getBoolean("type");
                Double money = resultSet.getDouble("money");
                String notes = resultSet.getString("notes");
                Long category = resultSet.getLong("id_category");
                Long user = resultSet.getLong("id_user");
                return new WalletManagement(id,type,money,notes,user,category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
