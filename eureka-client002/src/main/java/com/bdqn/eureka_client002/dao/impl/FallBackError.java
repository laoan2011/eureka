package com.bdqn.eureka_client002.dao.impl;

import org.springframework.stereotype.Component;

import com.bdqn.eureka_client002.dao.HelloFeigen;
@Component
public class FallBackError implements HelloFeigen{

	public String HelloFeigne(String name) {
		
		return name+"sorry error!";
	}

}
