package dto;

import entity.News;

public class DTOView {
    private News news;
    private int numberOfViews;

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
    public int getNumberOfViews() {
        return numberOfViews;
    }
    public News getNewId() {
        return news;
    }
    public void setNewId(News news) {
        this.news = news;
    }
}
