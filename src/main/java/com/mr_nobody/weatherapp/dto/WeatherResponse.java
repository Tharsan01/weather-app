package com.mr_nobody.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {

    @JsonProperty("name")
    private String cityName;

    @JsonProperty("weather")
    private List<WeatherDescription> weather;

    @JsonProperty("main")
    private Temperature temperature;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<WeatherDescription> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDescription> weather) {
        this.weather = weather;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public WeatherResponse() {
    }

    public WeatherResponse(String cityName, List<WeatherDescription> weather, Temperature temperature) {
        this.cityName = cityName;
        this.weather = weather;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "cityName='" + cityName + '\'' +
                ", weather=" + weather +
                ", temperature=" + temperature +
                '}';
    }

}
