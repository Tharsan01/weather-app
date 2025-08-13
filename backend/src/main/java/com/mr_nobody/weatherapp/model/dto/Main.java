package com.mr_nobody.weatherapp.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    private double temp;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;

    private int pressure;
    private int humidity;

    // Getters & Setters
    public double getTemp()
    { return temp; }
    public void setTemp(double temp)
    { this.temp = temp; }

    public double getTempMin()
    { return tempMin; }
    public void setTempMin(double tempMin)
    { this.tempMin = tempMin; }

    public double getTempMax()
    { return tempMax; }
    public void setTempMax(double tempMax)
    { this.tempMax = tempMax; }

    public int getPressure()
    { return pressure; }
    public void setPressure(int pressure)
    { this.pressure = pressure; }

    public int getHumidity()
    { return humidity; }
    public void setHumidity(int humidity)
    { this.humidity = humidity; }
}