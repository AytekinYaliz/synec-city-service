package com.synec.cityservice.service.model;

import com.synec.cityservice.model.IdName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WeatherServiceBBoxCitiesOutput {
    private Long cnt;
    private List<IdName> list;
}
