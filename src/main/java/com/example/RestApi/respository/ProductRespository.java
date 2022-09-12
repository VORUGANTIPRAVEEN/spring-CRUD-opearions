package com.example.RestApi.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApi.entity.Product;
public interface ProductRespository extends JpaRepository<Product,Integer>{}
