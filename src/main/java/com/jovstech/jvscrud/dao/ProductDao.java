package com.jovstech.jvscrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jovstech.jvscrud.model.Product;

public interface ProductDao extends JpaRepository<Product, Long>{
	
}
