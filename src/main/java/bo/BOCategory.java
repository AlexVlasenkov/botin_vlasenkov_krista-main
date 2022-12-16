package bo;

import javax.swing.*;
import java.util.Date;

public class BOCategory {
    private Integer id;
    private String header;
    private String text;
    private ImageIcon picture;
    private Date publicationDate;
    private String country;
    private int numberOfViews;

    public String getText() {
        return text;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getCountry() {
        return country;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public Integer getId() {
        return this.id;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getHeader() {
        return header;
    }
}
