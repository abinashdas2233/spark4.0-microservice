package com.kodewish.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Product-Service")
public interface ProductClient {
	
	
	@GetMapping("/place")
	public String orderPlace();

}
