package com.adi.storedetail.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adi.storedetail.pojo.Store;
import com.adi.storedetail.repository.StoreRepository;

@RestController
public class StoreController {

	private Logger logger = LogManager.getLogger();

	@Autowired
	private StoreRepository storeRepo;

	@GetMapping(path = "/store")
	public List<Store> getStores() {
		logger.info("--Fetch stores---");
		return (List<Store>) storeRepo.findAll();
	}

	@GetMapping(path = "/store/{storeId}")
	public Store getStoreDetails(@PathVariable(name = "storeId") String storeId) {
		logger.info("--Fetch store by id---" + storeId);
		Optional<Store> store = storeRepo.findById(storeId);

		if (store.isPresent()) {
			return store.get();
		}
		return null;
	}

	@PostMapping(path = "/store")
	public void addStore(@RequestBody Store store) {
		logger.info("--Adding store---" + store);
		storeRepo.save(store);
	}
}
