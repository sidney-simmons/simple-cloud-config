package com.sidneysimmons.simple.cloud.config.client.controller;

import com.sidneysimmons.simple.cloud.config.client.domain.TestPropertyResponse;
import com.sidneysimmons.simple.cloud.config.client.service.PropertyService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for interacting with the client.
 * 
 * @author Sidney Simmons
 */
@RestController
@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Resource(name = "propertyService")
    private PropertyService propertyService;

    @Value("${test.property1}")
    private String propertyViaSpring;

    /**
     * Return the external test properties! One from spring and one from hitting the API directly.
     * 
     * @return the test property response
     */
    @GetMapping(value = "")
    public TestPropertyResponse getTestProperty() {
        TestPropertyResponse response = new TestPropertyResponse();
        response.setPropertyViaSpring(propertyViaSpring);
        response.setPropertyViaApi(propertyService.getProperty("test.property2"));
        return response;
    }

}
