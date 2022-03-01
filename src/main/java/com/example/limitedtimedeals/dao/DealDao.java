package com.example.limitedtimedeals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.limitedtimedeals.model.Deal;

public interface DealDao extends JpaRepository<Deal, Integer>{

}