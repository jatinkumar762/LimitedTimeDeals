package com.example.limitedtimedeals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.limitedtimedeals.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}