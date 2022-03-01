package com.example.limitedtimedeals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.limitedtimedeals.dao.DealDao;
import com.example.limitedtimedeals.dao.ProductDao;
import com.example.limitedtimedeals.model.Deal;
import com.example.limitedtimedeals.model.Product;

@Service
public class DealService {

	@Autowired
	DealDao deal;
	
	@Autowired
	ProductDao pd;
	
	public void createDeal(Integer p_id, Integer max_count)
	{
		Product p = pd.getById(p_id);
		
		
		deal.save(new Deal());
		
	}
	
}
