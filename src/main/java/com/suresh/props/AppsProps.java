package com.suresh.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "reg-app")
@Data
public class AppsProps {

	//the map name should be same as the map name in yml file 
	Map<String,String> messages = new HashMap<>();
	
}
