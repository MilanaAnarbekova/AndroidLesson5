package com.example.androidlesson5;

import java.io.Serializable;

public class Country implements Serializable {

    private int image;
    private String country;
    private  String city;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country(int image, String country, String city, int id) {
        this.image = image;
        this.country = country;
        this.city = city;
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country(int image, String country, String city) {
        this.image = image;
        this.country = country;
        this.city = city;
    }
}
