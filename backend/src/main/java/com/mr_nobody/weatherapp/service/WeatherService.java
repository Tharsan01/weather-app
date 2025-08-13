package com.mr_nobody.weatherapp.service;

import com.mr_nobody.weatherapp.client.OpenWeatherClient;
import com.mr_nobody.weatherapp.dto.CityData;
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
    OpenWeatherClient openWeatherClient;
    @Cacheable(value = "weatherCache",key = "#cityCode")
    public WeatherResponse getWeatherForCity(Long cityCode) throws Exception {
        List<CityData> cities = cityService.loadCities;
        CityData city = cities
                .stream()
                .filter(c -> c.getCityCode().equals(cityCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("City Not Found: " + cityCode));
        return openWeatherClient.getWeather(city.getCoord().getLatitude(),
                                            city.getCoord().getLongitude());
    }
}
