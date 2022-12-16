package dto;

import entity.Categories;

import java.io.File;
import java.util.Date;

public class DTONews {

    private Categories categories;
    private Integer id;
    private String header;
    private String text;
    private File picture;
    private Date publicationDate;
    private int numberOfViews;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public Categories getCategory() {
        return categories;
    }
    public void setCategory(Categories categories) {
        this.categories = categories;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getNumberOfViews() {
        return numberOfViews;
    }
    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
    public File getPicture() {
        return picture;
    }
    public void setPicture(File picture) {
        this.picture = picture;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
