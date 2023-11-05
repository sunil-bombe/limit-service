package com.webwork.limitservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configurations {
	
	private int minimum;
	private int maximum;
	
	
	public Configurations() {
	}
	
	public Configurations(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}


	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
