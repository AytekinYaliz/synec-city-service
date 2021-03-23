package com.synec.cityservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AppConfig {

    // @Value("${FILE_NAME:Not found.}")
    // private String fileName;

    @Bean
    @ConfigurationProperties(prefix = "application")
    public ApplicationProperties applicationProperties() {
        return new ApplicationProperties();
    }

}
