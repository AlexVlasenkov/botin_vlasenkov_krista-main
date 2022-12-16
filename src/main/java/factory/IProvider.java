package factory;

import entity.Categories;
import entity.Views;
import entity.News;

import java.util.List;

public interface IProvider {
    List<News> getNews();
    List<Categories> getCategories();
    List<Views> getViews();
    void putNews(List<News> newsList);
}
