package com.mr_nobody.weatherapp.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenWeatherConfig {
    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.base-url}")
    private String baseUrl;

    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}