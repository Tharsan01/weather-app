package com.mr_nobody.weatherapp.controller;

import com.mr_nobody.weatherapp.dto.WeatherResponse;
import com.mr_nobody.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherController {
    @Autowired
    WeatherService weatherService;
    @GetMapping("/weather")
    public ResponseEntity<WeatherResponse> getWeather(@RequestParam("cityCode") Long cityCode){
        try{
            WeatherResponse weatherResponse = weatherService.getWeatherForCity(cityCode);
            return ResponseEntity.ok(weatherResponse);
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(null);
        }
        catch (Exception e){
            return ResponseEntity.status(500).body(null);
        }
    }
}
