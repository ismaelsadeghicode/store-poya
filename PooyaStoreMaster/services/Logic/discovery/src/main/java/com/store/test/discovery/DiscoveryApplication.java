package com.store.test.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
//check it out later
	//git chnage inn my local computer
	//3th git change
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}

}
