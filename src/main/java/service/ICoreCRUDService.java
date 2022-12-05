package service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ICoreCRUDService<E, K> {
    List<E> findAll(HttpServletRequest request);

    E findById(HttpServletRequest request);

    boolean add(HttpServletRequest request);
    boolean edit(HttpServletRequest request);

    boolean deleteById(HttpServletRequest request);
}
