package controller;

import bo.BONews;
import entity.News;

import java.util.List;

public interface INewsController {
    boolean createNewsUsingBO(BONews boNews);
    boolean updateBONews(BONews boNews);
    boolean deleteNewsById(Integer id);
    BONews getNewById(String clientName, int id);
    List<News> getListOfNews();
}
