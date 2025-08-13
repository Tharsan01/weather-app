package com.mr_nobody.weatherapp.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mr_nobody.weatherapp.dto.CityData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class CityService {
    public List<CityData> loadCities;
    @Autowired
    ObjectMapper objectMapper;
    public List<CityData> loadCities() throws IOException {
        ClassPathResource resource = new ClassPathResource("data/cities.json");
        return objectMapper.readValue(resource.getInputStream(), new TypeReference<List<CityData>>() {});
    }
}
