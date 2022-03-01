package com.example.limitedtimedeals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.limitedtimedeals.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
