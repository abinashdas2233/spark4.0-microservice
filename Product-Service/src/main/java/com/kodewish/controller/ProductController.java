package com.kodewish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

		@GetMapping("/place")
		public String orderPlace() {
			return "Hello your order i phone is ready to dispatch";
		}
}
