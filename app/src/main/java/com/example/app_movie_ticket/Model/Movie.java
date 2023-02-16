package com.example.app_movie_ticket.Model;

public class Movie {
    private Integer image;
    private String name;
    private String date;
    private String catogery;

    public Movie(Integer image, String name, String date, String catogery) {
        this.image = image;
        this.name = name;
        this.date = date;
        this.catogery = catogery;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return catogery;
    }

    public void setAuthor(String author) {
        this.catogery = catogery;
    }
}
