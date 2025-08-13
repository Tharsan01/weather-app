package com.mr_nobody.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityData {
    @JsonProperty("id")
    private Long cityCode;


    @JsonProperty("name")
    private String name;

    @JsonProperty("country")
    private String country;

    @JsonProperty("coord")
    private Coordinates coord;

    public CityData() {
    }

    public CityData(Long cityCode, String name, String country, Coordinates coord) {
        this.cityCode = cityCode;
        this.name = name;
        this.country = country;
        this.coord = coord;
    }


    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "cityCode=" + cityCode +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", coord=" + coord +
                '}';
    }


}



