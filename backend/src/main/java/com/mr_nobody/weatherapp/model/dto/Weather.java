package com.mr_nobody.weatherapp.model.dto;

public class Weather {

    private String main;
    private String description;

    // Getters & Setters
    public String getMain()
    { return main; }
    public void setMain(String main)
    { this.main = main; }

    public String getDescription()
    { return description; }
    public void setDescription(String description)
    { this.description = description; }
}