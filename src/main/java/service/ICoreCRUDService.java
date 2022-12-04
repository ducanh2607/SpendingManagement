package service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ICoreCRUDService<E, K> {
    List<E> findAll(HttpServletRequest request);

    E findById(HttpServletRequest request);

    void add(HttpServletRequest request);
    void upgrade(HttpServletRequest request);

}
