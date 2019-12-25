package io.github.huthesh.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
	private  String service;

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	
}
