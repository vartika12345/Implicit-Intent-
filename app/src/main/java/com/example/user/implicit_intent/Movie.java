package com.example.user.implicit_intent;

/**
 * Created by USER on 08-04-2016.
 */
public class Movie {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String title,genre,year;

    public Movie(String title,String genre,String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }



}
