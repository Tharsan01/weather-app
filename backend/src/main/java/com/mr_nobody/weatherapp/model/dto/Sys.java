package com.mr_nobody.weatherapp.model.dto;

public class Sys {

    private long sunrise;
    private long sunset;

    // Getters & Setters
    public long getSunrise()
    { return sunrise; }
    public void setSunrise(long sunrise)
    { this.sunrise = sunrise; }

    public long getSunset()
    { return sunset; }
    public void setSunset(long sunset)
    { this.sunset = sunset; }
}
