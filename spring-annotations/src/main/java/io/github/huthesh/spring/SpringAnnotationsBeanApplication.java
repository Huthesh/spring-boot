package io.github.huthesh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.huthesh.spring.bean.ExampleService;
import io.github.huthesh.thirdparty.bean.AnotherService;

@SpringBootApplication
public class SpringAnnotationsBeanApplication implements CommandLineRunner{

	@Autowired
	ExampleService exampleService;
	
	@Autowired
	AnotherService anotherService; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationsBeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exampleService.serve();
		anotherService.serve();
	}

}
