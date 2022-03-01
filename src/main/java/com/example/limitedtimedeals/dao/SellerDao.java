package com.example.limitedtimedeals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.limitedtimedeals.model.Seller;

public interface SellerDao extends JpaRepository<Seller, Integer>{

}
