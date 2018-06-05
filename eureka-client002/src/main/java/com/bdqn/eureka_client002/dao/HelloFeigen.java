package com.bdqn.eureka_client002.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdqn.eureka_client002.dao.impl.FallBackError;
@FeignClient(value="cloud-client001",fallback=FallBackError.class)
public interface HelloFeigen {
	@RequestMapping("/product")
	public String HelloFeigne(@RequestParam("name") String name);
}
