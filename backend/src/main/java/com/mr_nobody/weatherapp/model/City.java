package com.mr_nobody.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
    @JsonProperty("CityCode")
    private String CityCode;

    @JsonProperty("CityName")
    private String CityName;

    @JsonProperty("Temp")
    private String Temp;

    @JsonProperty("Status")
    private String Status;

    @JsonProperty("Description")
    private String Description;

    @JsonProperty("Pressure")
    private int Pressure;

    @JsonProperty("Humidity")
    private int Humidity;

    @JsonProperty("TempMin")
    private String TempMin;

    @JsonProperty("TempMax")
    private String TempMax;

    @JsonProperty("WindSpeed")
    private double WindSpeed;

    @JsonProperty("WindDeg")
    private int WindDeg;

    @JsonProperty("Sunrise")
    private long Sunrise;

    @JsonProperty("Sunset")
    private long Sunset;

    @JsonProperty("Visibility")
    private double Visibility;

    public City() {}

    public City(String cityCode, String cityName, String temp, String status, String description,
                int pressure, int humidity, String tempMin, String tempMax,
                double windSpeed, int windDeg, long sunrise, long sunset, double visibility) {
        this.CityCode = cityCode;
        this.CityName = cityName;
        this.Temp = temp;
        this.Status = status;
        this.Description = description;
        this.Pressure = pressure;
        this.Humidity = humidity;
        this.TempMin = tempMin;
        this.TempMax = tempMax;
        this.WindSpeed = windSpeed;
        this.WindDeg = windDeg;
        this.Sunrise = sunrise;
        this.Sunset = sunset;
        this.Visibility = visibility;
    }

    public String getCityCode() { return CityCode; }
    public void setCityCode(String cityCode) { this.CityCode = cityCode; }

    public String getCityName() { return CityName; }
    public void setCityName(String cityName) { this.CityName = cityName; }

    public String getTemp() { return Temp; }
    public void setTemp(String temp) { this.Temp = temp; }

    public String getStatus() { return Status; }
    public void setStatus(String status) { this.Status = status; }

    public String getDescription() { return Description; }
    public void setDescription(String description) { this.Description = description; }

    public int getPressure() { return Pressure; }
    public void setPressure(int pressure) { this.Pressure = pressure; }

    public int getHumidity() { return Humidity; }
    public void setHumidity(int humidity) { this.Humidity = humidity; }

    public String getTempMin() { return TempMin; }
    public void setTempMin(String tempMin) { this.TempMin = tempMin; }

    public String getTempMax() { return TempMax; }
    public void setTempMax(String tempMax) { this.TempMax = tempMax; }

    public double getWindSpeed() { return WindSpeed; }
    public void setWindSpeed(double windSpeed) { this.WindSpeed = windSpeed; }

    public int getWindDeg() { return WindDeg; }
    public void setWindDeg(int windDeg) { this.WindDeg = windDeg; }

    public long getSunrise() { return Sunrise; }
    public void setSunrise(long sunrise) { this.Sunrise = sunrise; }

    public long getSunset() { return Sunset; }
    public void setSunset(long sunset) { this.Sunset = sunset; }

    public double getVisibility() { return Visibility; }
    public void setVisibility(double visibility) { this.Visibility = visibility; }

    @Override
    public String toString() {
        return "City{CityCode='" + CityCode + "', CityName='" + CityName + "', Temp='" + Temp + "', Status='" + Status +
                "', Description='" + Description + "', Pressure=" + Pressure + ", Humidity=" + Humidity +
                ", TempMin='" + TempMin + "', TempMax='" + TempMax + "', WindSpeed=" + WindSpeed +
                ", WindDeg=" + WindDeg + ", Sunrise=" + Sunrise + ", Sunset=" + Sunset + ", Visibility=" + Visibility + "}";
    }
}