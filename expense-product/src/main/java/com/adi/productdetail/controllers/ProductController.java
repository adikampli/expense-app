package com.adi.productdetail.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adi.productdetail.StoreDetailsFeignClient;
import com.adi.productdetail.pojo.Product;
import com.adi.productdetail.pojo.Store;
import com.adi.productdetail.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private StoreDetailsFeignClient client;

	@GetMapping(path = "/product")
	public List<Product> getProducts() {
		return (List<Product>) productRepo.findAll();
	}

	@PostMapping(path = "/product")
	public Product addProduct(@RequestBody Product product) {
		Store store = client.getStoreDetails(product.getStore().getStoreId());
		Product addedProduct = null;
		if (store != null) {
			product.setStore(store);
			addedProduct = productRepo.save(product);
		}
		return addedProduct;
	}

}
