package com.bdqn.eureka_client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {
	 public static void main(String[] args) {
		 SpringApplication.run(EurekaClientApplication.class, args); 
	    }
}
@RestController
class ServiceInstanceRestController {
    @RequestMapping("/")
    public String sayhello() {
        return "hello client1";
    }
    
    @RequestMapping("/product")
    
    public String index(@RequestParam String name) {
    	return "hello this is productor "+name;
    }
}