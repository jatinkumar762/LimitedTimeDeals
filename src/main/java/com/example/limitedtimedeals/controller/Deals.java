package com.example.limitedtimedeals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitedtimedeals.service.DealService;

@RestController
public class Deals 
{
	
	@Autowired
	DealService ds;
	
	@PostMapping
	public void createDeal(@RequestParam Integer p_id, @RequestParam Integer max_count)
	{
		
		ds.createDeal(p_id, max_count);
		
	}

}
