package io.github.huthesh.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.github.huthesh.spring.bean.ExampleService;
import io.github.huthesh.spring.bean.impl.ExampleServiceImpl;

@Configuration
@ComponentScan({"io.github.huthesh.thirdparty","io.github.huthesh.spring"})
public class Config {
	
	/**
	 * Method is responsible for creating  the bean. Since the  bean is  created by the spring container,
	 * bean life cycle will be managed by Spring  IOC container.
	 *  
	 * @return
	 */
	@Bean
	public ExampleService exampleService() {
		return new ExampleServiceImpl();
	}
	
	
}
