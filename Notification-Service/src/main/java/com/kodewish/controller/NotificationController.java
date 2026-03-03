package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.client.ProductClient;

@RestController
@RequestMapping("/amazon")
public class NotificationController {
	@Autowired
	ProductClient client;
	
	
	
	@GetMapping("/fetch")
	public String fetchData() {
		
		return client.orderPlace();
		
	}

}
