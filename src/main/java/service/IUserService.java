package service;

import model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IUserService extends ICoreCRUDService<User, Long>{
    boolean update(HttpServletRequest request);

    List<User> findByNameContaining(HttpServletRequest request);
}
