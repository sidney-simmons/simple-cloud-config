package com.sidneysimmons.simple.cloud.config.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Application configuration.
 * 
 * @author Sidney Simmons
 */
@Configuration
public class ApplicationConfiguration {

    @Bean(name = "restTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}