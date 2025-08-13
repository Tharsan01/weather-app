package com.mr_nobody.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDescription {
    @JsonProperty("description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WeatherDescription() {
    }

    public WeatherDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WeatherDescription{description='" + description + "'}";
    }
}
