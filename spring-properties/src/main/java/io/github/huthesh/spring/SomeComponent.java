package io.github.huthesh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {
	
	@Autowired
	Environment environment;
	
	@Value("${someprop}")
	String someprop;
	
	@Autowired
	ApplicationProperties applicationProperties;
	
	public String getPropFormEnvironment(String propName) {
		return environment.getProperty(propName);
	}
	
	public String  getPropBySpel() {
		return someprop;
	}
	
	public  String getPropConfigProperty() {
		return applicationProperties.getService();
	}
}
