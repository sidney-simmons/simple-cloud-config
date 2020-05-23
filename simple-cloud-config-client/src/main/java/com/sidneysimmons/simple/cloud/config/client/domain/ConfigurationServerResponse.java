package com.sidneysimmons.simple.cloud.config.client.domain;

import java.util.List;
import lombok.Data;

/**
 * Configuration server response.
 * 
 * @author Sidney Simmons
 */
@Data
public class ConfigurationServerResponse {

    private String name;
    private String version;
    private List<ConfigurationServerPropertySource> propertySources;

}
