package io.github.huthesh.thirdparty.bean.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.github.huthesh.thirdparty.bean.AnotherService;

@Service
public class AnotherServiceImpl implements AnotherService {
	
	private  String uuid;
	
	private static final Logger logger = LoggerFactory.getLogger(AnotherServiceImpl.class);

	public AnotherServiceImpl() {
		uuid = UUID.randomUUID().toString();
	}
	@Override
	public String serve() {
		logger.info("Invoked AnotherServiceImpl.serve() with uuid {}",uuid);
		return uuid;
	}

}
