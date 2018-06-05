package com.bdqn.eureka_client002.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.eureka_client002.dao.HelloFeigen;
import com.bdqn.eureka_client002.service.FeigenService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class FeigenServiceImpl implements FeigenService{

	@Autowired
	HelloFeigen helloFeigen;
	public String test(String name) {
		return helloFeigen.HelloFeigne(name);
	}

	
}
