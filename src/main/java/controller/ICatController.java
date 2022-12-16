package controller;

import bo.BOCategory;
import entity.Categories;
import java.util.List;

public interface ICatController {
    boolean add(String name);
    boolean update(int id, String name);
    boolean delete(int id);
    BOCategory createBOCategoryByID(Integer id);
    BOCategory getCategoryByID(Integer id);
    List<BOCategory> createBOListCategory(List<Integer> ids);
    List<Categories> getAllCategories();
}
