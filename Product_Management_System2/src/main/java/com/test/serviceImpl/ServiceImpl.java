package com.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Product;
import com.test.repository.ProductRepository;
import com.test.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	ProductRepository pr;

	@Override
	public void addProduct(Product p) {
		
		pr.save(p);
		
	}
	
	
}
