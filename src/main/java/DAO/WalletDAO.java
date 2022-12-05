package DAO;

import connection.MyConnection;
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
    private final CategoryDao categoryDao;
    private final String SELECT_ALL_PRODUCTS = "select * from walletmanagement;";
    private final String SELECT_PRODUCT_BY_ID = "select * from walletmanagement where id = ?;";
    private final String INSERT_PRODUCT = "insert into walletmanagement(type, money,notes,id_category,id_user) value (?,?,?,?,?,?);";
    private final String UPDATE_PRODUCT = "update walletmanagement set money = ?, notes = ?, id_category = ? where id = ?;";
    private final String DELETE_PRODUCT = "delete from walletmanagement where id = ?;";

    public WalletDAO() {
        connection = MyConnection.getConnection();
        userDAO = new UserDAO();
        categoryDao = new CategoryDao();
    }


    public List<WalletManagement> findAll() {
        List<WalletManagement> products = new ArrayList<>();
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement(SELECT_ALL_PRODUCTS)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                LocalDate date = resultSet.getDate("date_create").toLocalDate();
                Boolean type = resultSet.getBoolean("type");
                Double money = resultSet.getDouble("money");
                Integer quantity = resultSet.getInt("quantity");
                Long categoryId = resultSet.getLong("id_category");
                Long userId = resultSet.getLong("id_user");
               //  products.add(new Product(id, name, price, quantity, category));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

}
