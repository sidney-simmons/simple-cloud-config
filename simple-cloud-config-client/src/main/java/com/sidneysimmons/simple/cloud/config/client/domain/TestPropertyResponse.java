package com.sidneysimmons.simple.cloud.config.client.domain;

import lombok.Data;

/**
 * Response object for returning the test properties.
 * 
 * @author Sidney Simmons
 */
@Data
public class TestPropertyResponse {

    private String propertyViaSpring;
    private String propertyViaApi;

}
