package com.mr_nobody.weatherapp.util;

import com.mr_nobody.weatherapp.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class JsonUtil {
    @Autowired
    RestTemplate restTemplate;

    @Value("${openweathermap.api.key}")
    private String apiKey;

    @Value("${openweathermap.api.url}")
    private String apiUrl;

    public WeatherResponse getWeather(double latitude, double longitude) {
        String url = String.format("%s?lat=%s&lon=%s&appid=%s&units=metric", apiUrl, latitude, longitude, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
