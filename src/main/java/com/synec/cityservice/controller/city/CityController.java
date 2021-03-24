package com.synec.cityservice.controller.city;

import com.synec.cityservice.advice.ExecutionTimeTracker;
import com.synec.cityservice.controller.city.model.SearchInput;
import com.synec.cityservice.model.IdName;
import com.synec.cityservice.model.response.SynecResponse;
import com.synec.cityservice.model.response.OKResponse;
import com.synec.cityservice.service.CityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequestMapping(path = "api/v1/cities")
@RequiredArgsConstructor
@RestController
public class CityController {

    private final CityService cityService;

    @ExecutionTimeTracker
    @GetMapping("/search")
    public SynecResponse<List<IdName>> search(@Valid SearchInput input) {
        return new OKResponse(cityService.search(input));
    }
}
