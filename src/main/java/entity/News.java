package entity;

import java.io.File;
import java.util.Date;

public class News {

    private Integer id;
    private Integer categoryId;
    private String header;
    private String text;
    private File picture;
    private Date publicationDate;

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
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
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
