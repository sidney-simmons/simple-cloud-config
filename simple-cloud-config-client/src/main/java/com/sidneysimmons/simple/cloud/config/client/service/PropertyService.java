package com.sidneysimmons.simple.cloud.config.client.service;

import com.sidneysimmons.simple.cloud.config.client.domain.ConfigurationServerPropertySource;
import com.sidneysimmons.simple.cloud.config.client.domain.ConfigurationServerResponse;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

    @Value("${spring.cloud.config.uri}")
    private String configurationServerUri;

    @Value("${spring.application.name}")
    private String applicationName;

    /**
     * Get a property directly from the configuration server.
     * 
     * @param propertyName the property name
     * @return the property if found, null otherwise
     */
    public String getProperty(String propertyName) {
        ResponseEntity<ConfigurationServerResponse> response = restTemplate.exchange(
                configurationServerUri + "/" + applicationName + "/default", HttpMethod.GET, null,
                ConfigurationServerResponse.class);
        return getProperty(response.getBody(), propertyName);
    }

    /**
     * Get a property from the configuration server response. Here we're returning the first property
     * found in the list of property sources.
     * 
     * @param response the configuration server response
     * @param propertyName the property name
     * @return the property if found, null otherwise
     */
    private String getProperty(ConfigurationServerResponse response, String propertyName) {
        // Loop through the property sources and return the first instance of the property found
        for (ConfigurationServerPropertySource propertySource : response.getPropertySources()) {
            if (propertySource.getSource().containsKey(propertyName)) {
                return propertySource.getSource().get(propertyName);
            }
        }

        // Property not found
        return null;
    }

}
