package com.sidneysimmons.simple.cloud.config.client.domain;

import java.util.Map;
import lombok.Data;

/**
 * Configuration server property source.
 * 
 * @author Sidney Simmons
 */
@Data
public class ConfigurationServerPropertySource {

    private String name;
    private Map<String, String> source;

}
