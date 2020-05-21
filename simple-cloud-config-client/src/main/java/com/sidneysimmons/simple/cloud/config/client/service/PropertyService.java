package com.sidneysimmons.simple.cloud.config.client.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Property service.
 * 
 * @author Sidney Simmons
 */
@Service("propertyService")
public class PropertyService {

    @Resource(name = "restTemplate")
    private RestTemplate restTemplate;

    public String getProperty(String propertyName) {
        // ResponseEntity<String> response = restTemplate.exchange("", HttpMethod.GET, null, String.class);
        // return response.getBody();
        return null;
    }

}
