package com.mr_nobody.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {
        @JsonProperty("lon")
        private Double longtitude;

        @JsonProperty("lat")
        private Double latitude;


    public Coordinates(Double longtitude, Double latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public Coordinates() {
    }
        public Double getLongtitude() {
            return longtitude;
        }

        public void setLongtitude(Double longtitude) {
            this.longtitude = longtitude;
        }



    public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }
    @Override
    public String toString() {
        return "Coordinates{" +
                "longitude=" + longtitude +
                ", latitude=" + latitude +
                '}';
    }



}
