package controller;

import bo.BONews;
import entity.Categories;
import entity.News;
import java.util.List;

public class Facade {
    private static INewsController newsController = new NewsController();
    private static ICatController ICatController;

    public static Boolean createBONews(BONews newBo) {
        return newsController.createNewsUsingBO(newBo);
    }
    public static BONews getNewsByID(String client, int id) {
        return newsController.getNewById(client, id);
    }
    public static List<News> getListOfNews() {
        return newsController.getListOfNews();
    }
    public Boolean updateBONews(BONews boNews) {
        return newsController.updateBONews(boNews);
    }
    public static Boolean deleteNewsByID(Integer id) {
        return newsController.deleteNewsById(id);
    }
    public Boolean addCategoryByName(String name){
        return ICatController.add(name);
    }
    public static List<Categories> getCategories() {
        return ICatController.getAllCategories();
    }
    public Boolean deleteCategory(int id){
        return ICatController.delete(id);
    }
    public Boolean renameCategory(int id, String name){
        return ICatController.update(id, name);
    }
}
