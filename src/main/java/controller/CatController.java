package controller;

import factory.Factory;
import bo.BOCategory;
import entity.Categories;
import java.util.ArrayList;
import java.util.List;
import factory.IProvider;

public class CatController implements ICatController {
    @Override
    public boolean add(String name) {
        return true;
    }

    @Override
    public boolean update(int id, String name) {
        return true;
    }

    @Override
    public boolean delete(int id) {
        return true;
    }

    @Override
    public BOCategory createBOCategoryByID(Integer id) {
        return new BOCategory();
    }

    @Override
    public BOCategory getCategoryByID(Integer id) {
        return null;
    }

    @Override
    public List<BOCategory> createBOListCategory(List<Integer> identiferList) {
        List<BOCategory> listOfCats = new ArrayList<>();
        for (Integer IDofBOCat : identiferList) {
            listOfCats.add(createBOCategoryByID(IDofBOCat));
        }

        return listOfCats;
    }

    @Override
    public List<Categories> getAllCategories() {
        IProvider ip = Factory.getProvider("Клиент_1");

        return ip.getCategories();
    }
}
