package com.synec.cityservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer mvcConfigurer() {
        return new WebMvcConfigurerAdapter() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");

//                registry.addMapping("/api/**")
//                        .allowedOrigins("http://domain2.com")
//                        .allowedMethods("PUT", "DELETE")
//                        .allowedHeaders("header1", "header2", "header3")
//                        .exposedHeaders("header1", "header2")
//                        .allowCredentials(false).maxAge(3600);
            }
        };
    }
}

