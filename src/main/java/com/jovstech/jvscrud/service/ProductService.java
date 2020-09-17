package com.jovstech.jvscrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jovstech.jvscrud.dao.ProductDao;
import com.jovstech.jvscrud.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	
	
	public Product addProduct(Product product) {
		return productDao.save(product);
		
	}
	
	public List<Product> getAllProduct(){
		return productDao.findAll();
	}
	
	
	public Product getProductById(Long id ) {
		Optional <Product> product= productDao.findById(id);
		if(product.isPresent()) {
			return product.get();
		}else {
			return new Product (9999999999998L, "Product don't exists");
		}
	}
	
}
