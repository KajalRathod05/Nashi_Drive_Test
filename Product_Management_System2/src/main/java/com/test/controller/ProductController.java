package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Product;
import com.test.serviceI.ServiceI;

@RestController
public class ProductController {

	@Autowired
	ServiceI ssi;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product p)
	{
		ssi.addProduct(p);
		return "Product added successfully....";
	}
}
