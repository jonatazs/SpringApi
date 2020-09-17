package com.jovstech.jvscrud.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jovstech.jvscrud.model.Product;
import com.jovstech.jvscrud.service.ProductService;



@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	
	@GetMapping
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@GetMapping(path="{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		return productService.getProductById(id);
	}
	
	
	
	
	
}
