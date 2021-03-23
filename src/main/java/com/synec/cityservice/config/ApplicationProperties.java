package com.synec.cityservice.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class ApplicationProperties {
    private String weatherServiceBaseUrl;
    private String weatherServiceAppId;
}
