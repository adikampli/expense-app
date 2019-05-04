package com.adi.productdetail.repository;

import org.springframework.data.repository.CrudRepository;

import com.adi.productdetail.pojo.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
