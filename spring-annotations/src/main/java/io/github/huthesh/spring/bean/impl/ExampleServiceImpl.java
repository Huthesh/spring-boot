package io.github.huthesh.spring.bean.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.huthesh.spring.bean.ExampleService;


/**
 * This bean in inject through config  class.
 * 
 * @author Huthesh
 *
 */

public class ExampleServiceImpl implements ExampleService{

	
	private static final Logger logger = LoggerFactory.getLogger(ExampleServiceImpl.class);
	
	private  String uuid;
	public ExampleServiceImpl() {
		uuid = UUID.randomUUID().toString();
	}
	
	@Override
	public String serve() {
		logger.info("Invoked ExampleServiceImpl.serve() with uuid {}",uuid);
		return uuid;
	}
}
