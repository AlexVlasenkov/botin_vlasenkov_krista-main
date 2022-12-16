package controller;

import factory.Factory;
import factory.IProvider;
import bo.BONews;
import entity.Views;
import entity.News;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsController implements INewsController {
    private List<News> newsList;
    private List <Views> viewsList;

    public NewsController() {
        newsList = new ArrayList<>();
        viewsList = new ArrayList<>();

        int j = 0;
        for (int i = 0; i < 5; i++) {
            News news = new News();
            news.setHeader("HEADER");
            news.setCategoryId(j);
            news.setId(i);
            news.setPublicationDate(new Date(System.currentTimeMillis()));
            news.setPicture(null);
            newsList.add(news);
            j += 1;

            Views views = new Views();
            views.setNewId(i);
            views.setNumberOfViews(i * 100);
            viewsList.add(views);
        }
    }

    @Override
    public boolean createNewsUsingBO(BONews boNews) {
        IProvider iProvider = Factory.getProvider("Клиент_2");
        List<News> newsList = iProvider.getNews();

        News newsObject  = new News();
        newsObject.setId(boNews.getId());
        newsObject.setCategoryId(1);
        newsObject.setHeader(boNews.getHeader());
        newsObject.setText(boNews.getText());
        newsObject.setPicture(boNews.getPicture());
        newsObject.setPublicationDate(boNews.getPublicationDate());
        newsList.add(newsObject);

        return true;
    }

    @Override
    public BONews getNewById(String client, int id) {
        BONews boNews = new BONews();
        IProvider iProvider = Factory.getProvider(client);
        List<News> listOfNews = iProvider.getNews();
        List<Views> listOfViews = iProvider.getViews();

        for (News newsObj : listOfNews) {
            if (newsObj.getId().equals(id)) {
                boNews.setHeader(newsObj.getHeader());
                boNews.setId(newsObj.getId());
                for (Views views : listOfViews) {
                    if (views.getNewId().equals(newsObj.getId())) {
                        boNews.setNumberOfViews(views.getNumberOfViews());
                    }
                }
            }
        }

        return boNews;
    }

    @Override
    public boolean updateBONews(BONews boNews) {
        IProvider iProvider = Factory.getProvider("Клиент_3");
        List<News> newsList = iProvider.getNews();

        News newsObject  = new News();
        newsObject.setText(boNews.getText());
        newsObject.setPublicationDate(boNews.getPublicationDate());
        newsList.add(newsObject);

        return true;
    }

    @Override
    public boolean deleteNewsById(Integer id) {
        IProvider iProvider = Factory.getProvider("Клиент_4");
        List<News> listOfNewsProv = iProvider.getNews();
        boolean find = false;

        List<News> newsList = new ArrayList<>();

        for (News news: listOfNewsProv) {
            if (news.getId().equals(id)) {
                find = true;
            }
            else {
                newsList.add(news);
            }
        }
        iProvider.putNews(newsList);

        return find;
    }

    @Override
    public List<News> getListOfNews() {
        IProvider iprovider = Factory.getProvider("Клиент_5");
        List<News> newsList = iprovider.getNews();

        return newsList;
    }
}
