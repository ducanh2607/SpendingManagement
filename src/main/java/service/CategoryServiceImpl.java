package service;

import DAO.CategoryDAO;
import model.Category;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CategoryServiceImpl implements ICategoryService{
    private final CategoryDAO categoryDAO;

    public CategoryServiceImpl() {
       categoryDAO = new CategoryDAO();
    }

    @Override
    public List<Category> findAll(HttpServletRequest request) {
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(HttpServletRequest request) {
        Long id = Long.parseLong(request.getParameter("id"));
        return categoryDAO.findCategoryById(id);
    }

    @Override
    public boolean add(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        Boolean type = Boolean.valueOf(request.getParameter("type"));
            return categoryDAO.createCategory(new Category(name, type));
        }

    @Override
    public void upgrade(HttpServletRequest request) {
    }
}
