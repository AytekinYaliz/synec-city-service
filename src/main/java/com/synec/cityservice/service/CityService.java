package com.synec.cityservice.service;

import com.synec.cityservice.config.ApplicationProperties;
import com.synec.cityservice.controller.city.model.SearchInput;
import com.synec.cityservice.model.IdName;
import com.synec.cityservice.service.model.WeatherServiceBBoxCitiesOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class CityService {

    private final ApplicationProperties applicationProperties;
    private final RestTemplate restTemplate;

    public List<IdName> search(SearchInput input) {
        log.debug("CityService.search: " + input.toString());

        String url = applicationProperties.getWeatherServiceBaseUrl() + "/box/city?bbox=12,32,15,37,10&appid=" + applicationProperties.getWeatherServiceAppId();

        ResponseEntity<WeatherServiceBBoxCitiesOutput> allCities = restTemplate.getForEntity(url, WeatherServiceBBoxCitiesOutput.class);

        List<IdName> cities = allCities.getBody().getList()
                .stream()
                .filter(city -> city.getName().toLowerCase().startsWith(input.getName().toLowerCase()))
                .collect(Collectors.toList());

        return cities;
    }
}
