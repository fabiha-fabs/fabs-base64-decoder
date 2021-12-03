package com.fabs.base64decoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Base64decoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Base64decoderApplication.class, args);
	}

}
