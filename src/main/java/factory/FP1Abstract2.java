package factory;

import entity.Categories;
import entity.Views;
import entity.News;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class FP1Abstract2 extends FP1 {
    private static List<News> newsList;
    private static List<Views> viewsList;
    private static List<Categories> categoriesList;
    private static final int NEWS = Integer.MAX_VALUE;
    private static final int VIEWS = 999;

    public FP1Abstract2() {
        newsList = new ArrayList<>();
        int j = 0;
        {
            int i = 0;
            while (i < NEWS) {
                News news = new News();

                news.setHeader("HEADER");
                news.setCategoryId(j);
                news.setId(i);
                news.setPublicationDate(new Date(System.currentTimeMillis()));
                news.setPicture(null);
                newsList.add(news);

                j = (j + 1) % 7;
                i++;
            }
        }

        viewsList = new ArrayList<>();
        IntStream.range(0, VIEWS).forEach(i -> {
            Views views = new Views();
            views.setNewId(i);
            views.setNumberOfViews(i * 9);
            viewsList.add(views);
        });

        categoriesList = new ArrayList<>();
        IntStream.rangeClosed(1, NEWS).forEachOrdered(i -> {
            Categories categories = new Categories();
            categories.setId(i);
            categories.setName("Category" + i);
        });
    }

    @Override
    public List<Views> getViews() {
        return viewsList;
    }
    @Override
    public List<News> getNews() {
        return newsList;
    }
    @Override
    public List<Categories> getCategories() {
        return categoriesList;
    }
    @Override
    public void putNews(List<News> newsList) {
        this.newsList = newsList;
    }
}
