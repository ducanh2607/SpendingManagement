package service;

import DAO.CategoryDAO;
import DAO.UserDAO;
import DAO.WalletDAO;
import model.Category;
import model.User;
import model.WalletManagement;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class WalletManagementImpl implements IWalletService{
    private static ArrayList<WalletManagement> walletManagements;
    private static ArrayList<Category> categories;
    private static ArrayList<User> users;
    private static Long INDEX;

    private CategoryDAO categoryDAO;
    private WalletDAO walletDAO;
    private UserDAO userDAO;

    public WalletManagementImpl() {
        walletDAO = new WalletDAO();
        categoryDAO = new CategoryDAO();
        userDAO = new UserDAO();
    }

    @Override
    public List<WalletManagement> findAll(HttpServletRequest request) {
        return walletDAO.findAll();
    }
    public List<Category> findAllCategory(HttpServletRequest request) {
        return categoryDAO.findAll();
    }

    @Override
    public WalletManagement findById(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return walletDAO.findWalletById(id);
    }

    @Override
    public boolean add(HttpServletRequest request) {
        String walletID = request.getParameter("id");
        boolean type  = Boolean.parseBoolean(request.getParameter("type"));
        Double money = Double.parseDouble(request.getParameter("money"));
        String notes = request.getParameter("notes");
        Long categoryId = Long.parseLong(request.getParameter("category"));

        return true;
    }

    @Override
    public void upgrade(HttpServletRequest request) {

    }

    @Override
    public boolean edit(HttpServletRequest request) {
        return false;
    }

    @Override
    public boolean deleteById(HttpServletRequest request) {
        return false;
    }

    @Override
    public List<WalletManagement> findByNameContaining(HttpServletRequest request) {
        return null;
    }
}
