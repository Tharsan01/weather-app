package com.mr_nobody.weatherapp.service;

import com.mr_nobody.weatherapp.util.JsonUtil;
import com.mr_nobody.weatherapp.dto.CityWeather;
import com.mr_nobody.weatherapp.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    CityService cityService;
    @Autowired
    JsonUtil openWeatherClient;
    @Cacheable(value = "weatherCache", key = "#cityCode")
    public WeatherResponse getWeatherForCity(Long cityCode) throws Exception {
        logger.info("Fetching weather for cityCode: {}", cityCode);
        List<CityWeather> cities = cityService.loadCities();
        CityWeather city = cities.stream()
                .filter(c -> c.getCityCode().equals(cityCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("City not found: " + cityCode));
        logger.info("Found city: {}", city.getName());
        return openWeatherClient.getWeather(city.getCityCode());
    }
}
}
