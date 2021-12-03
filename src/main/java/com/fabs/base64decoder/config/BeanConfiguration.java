package com.fabs.base64decoder.config;

import org.apache.commons.codec.binary.Base64;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	@LoadBalanced
	public Base64 getBase64() {
		return new Base64();
	}
}
