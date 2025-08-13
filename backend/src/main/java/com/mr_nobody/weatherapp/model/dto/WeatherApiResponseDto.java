package com.mr_nobody.weatherapp.model.dto;

import java.util.List;

public class WeatherApiResponseDto {

    private String cityCode;
    private String cityName;
    private Main main;
    private List<Weather> weather;
    private Wind wind;
    private Sys sys;
    private double visibility; // in meters

    // Getters & Setters
    public String getCityCode()
    { return cityCode; }
    public void setCityCode(String cityCode)
    { this.cityCode = cityCode; }

    public String getCityName()
    { return cityName; }
    public void setCityName(String cityName)
    { this.cityName = cityName; }

    public Main getMain()
    { return main; }
    public void setMain(Main main)
    { this.main = main; }

    public List<Weather> getWeather()
    { return weather; }
    public void setWeather(List<Weather> weather)
    { this.weather = weather; }

    public Wind getWind()
    { return wind; }
    public void setWind(Wind wind)
    { this.wind = wind; }

    public Sys getSys()
    { return sys; }
    public void setSys(Sys sys)
    { this.sys = sys; }

    public double getVisibility()
    { return visibility; }
    public void setVisibility(double visibility)
    { this.visibility = visibility; }
}
