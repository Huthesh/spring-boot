package io.github.huthesh.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsBeanApplication implements CommandLineRunner{

	
	private static final Logger logger = LoggerFactory.getLogger(SpringAnnotationsBeanApplication.class);

	@Autowired
	SomeComponent someComponent;
	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationsBeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("getPropFormEnvironment {}",someComponent.getPropFormEnvironment("someprop"));
		logger.info("getPropBySpel {}",someComponent.getPropBySpel());
		logger.info("getPropConfigProperty {}",someComponent.getPropConfigProperty());
	}
}
