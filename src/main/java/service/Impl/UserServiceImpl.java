package service.Impl;

import DAO.UserDAO;
import model.User;
import service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private final UserDAO userDAO;

    public UserServiceImpl() {
        userDAO = new UserDAO();
    }

    @Override
    public List<User> findAll(HttpServletRequest request) {
        return userDAO.findAll();
    }

    @Override
    public User findById(HttpServletRequest request) {
        return null;
    }

    @Override
    public boolean add(HttpServletRequest request) {
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return userDAO.createUser(new User(name, username, password));
    }

    @Override
    public void upgrade(HttpServletRequest request) {

    }


    @Override
    public boolean update(HttpServletRequest request) {
        return false;
    }

    @Override
    public List<User> findByNameContaining(HttpServletRequest request) {
        return null;
    }
}
