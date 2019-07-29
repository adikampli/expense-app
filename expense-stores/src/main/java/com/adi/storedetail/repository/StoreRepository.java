package com.adi.storedetail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adi.storedetail.pojo.Store;

public interface StoreRepository extends MongoRepository<Store, String>{

}
