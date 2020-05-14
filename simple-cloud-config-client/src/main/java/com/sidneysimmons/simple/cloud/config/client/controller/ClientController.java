package com.sidneysimmons.simple.cloud.config.client.controller;

import com.sidneysimmons.simple.cloud.config.client.domain.TestPropertyResponse;
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

    @Value("${test.property}")
    private String testProperty;

    /**
     * Return the external test property!
     * 
     * @return the test property response
     */
    @GetMapping(value = "")
    public TestPropertyResponse getTestProperty() {
        TestPropertyResponse response = new TestPropertyResponse();
        response.setTestProperty(testProperty);
        return response;
    }

}
