package service;

import DAO.UserDAO;
import model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService{
    private final UserDAO userDAO;
    public UserServiceImpl(){
        userDAO = new UserDAO();
    }

    @Override
    public List<User> findAll(HttpServletRequest request) {

        return userDAO.findAll();
    }

    @Override
    public User findById(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return userDAO.findUserById(id);
    }

    @Override
    public void add(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        userDAO.createUser(new User(userName,password));

    }
    @Override
    public void upgrade(HttpServletRequest request){
        String id = request.getParameter("id");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        userDAO.updateUser(new User(Long.parseLong(id),name, userName, password));
    }
}
