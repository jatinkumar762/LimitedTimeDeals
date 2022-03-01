package com.example.limitedtimedeals.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.limitedtimedeals.dao.ProductDao;


public class ProductService {

	@Autowired
	ProductDao product;
	
}
