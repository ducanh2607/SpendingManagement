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
        Long id = Long.parseLong(request.getParameter("id"));
        return userDAO.findById(id);

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
        Long id  = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        return userDAO.updateUser(new User(id, name, userName, password));
    }
    public boolean delete(HttpServletRequest request){
        Long id = Long.parseLong(request.getParameter("id"));
        return userDAO.deleteById(id);
    }
    public boolean block(HttpServletRequest request){
        Long id = Long.parseLong(request.getParameter("id"));
        return userDAO.blockUser(id);
    }

    @Override
    public List<User> findByNameContaining(HttpServletRequest request) {
        return null;
    }
}
