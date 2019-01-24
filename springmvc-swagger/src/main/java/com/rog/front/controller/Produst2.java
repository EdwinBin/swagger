package com.rog.front.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rog.front.bean.Product;
import com.rog.front.controller.Products;
@RestController
public class Produst2 implements Products{

	@Override
	public String getdsfasdffdaas(Long id, Long ids) {
		 Product product = new Product();
	        product.setName("空气净化器");
	        product.setId(1L);
	        product.setProductClass("filters");
	        product.setProductId("T12345");
	        return "sdadasd";
	}

	@Override
	public ResponseEntity<Product> getdadfafds(Long id) {
		 Product product = new Product();
	        product.setName("空气净化器");
	        product.setId(1L);
	        product.setProductClass("filters");
	        product.setProductId("T12345");
	        return ResponseEntity.ok(product);
	}

	@Override
	public ResponseEntity<Product> getsafdsafdsfasf(Long id) {
		 Product product = new Product();
	        product.setName("空气净化器");
	        product.setId(1L);
	        product.setProductClass("filters");
	        product.setProductId("T12345");
	        return ResponseEntity.ok(product);
	}


}
