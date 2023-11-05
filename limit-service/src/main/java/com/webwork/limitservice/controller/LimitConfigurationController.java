package com.webwork.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webwork.limitservice.beans.LimitConfiguartions;
import com.webwork.limitservice.config.Configurations;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configurations configurations;
	
	@GetMapping("/limits")
	public LimitConfiguartions retriveLimitConfigurations() {
		return new LimitConfiguartions(configurations.getMinimum(),configurations.getMaximum());
	}

}
