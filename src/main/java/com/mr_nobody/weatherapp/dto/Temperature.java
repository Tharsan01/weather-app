package com.mr_nobody.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Temperature {
    @JsonProperty("temp")
    private Double temp;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Temperature(Double temp) {
        this.temp = temp;
    }

    public Temperature() {
    }
    @Override
    public String toString() {
        return "Temperature{temp=" + temp + "}";
    }
}
