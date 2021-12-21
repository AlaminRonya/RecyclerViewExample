package com.example.day17pactice.pojo;

import com.example.day17pactice.R;

import java.util.Arrays;
import java.util.List;

public class Movie {
    private String name;
    private double rating;
    private int img;

    public Movie(String name, double rating, int img) {
        this.name = name;
        this.rating = rating;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", img=" + img +
                '}';
    }
    public  static List<Movie> getAllMovie(){
        return Arrays.asList(
                new Movie("Spider-man",10, R.drawable.ss),
                new Movie("Spider-man",10, R.drawable.img1),
                new Movie("Spider-man",10, R.drawable.ddd),
                new Movie("Spider-man",10, R.drawable.tom),
                new Movie("Spider-man",10, R.drawable.ss)
        );
    }

}
