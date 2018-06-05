package com.bdqn.eureka_client002.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdqn.eureka_client002.dao.HelloFeigen;
import com.bdqn.eureka_client002.service.impl.FeigenServiceImpl;

@RestController
public class Client2Controller {
	@Autowired
	private FeigenServiceImpl service;
	@RequestMapping("/hello")
	public String hello() {
		return "client002 -----hello!";
	}
	@RequestMapping("/feigen/{name}")
	public String consumer(@PathVariable("name") String name) {
		return service.test(name);
	}
}
