package com.adi.storedetail.controllers;

import java.util.List;

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

	@Autowired
	private StoreRepository storeRepo;

	@GetMapping(path = "/store")
	public List<Store> getStores() {
		return (List<Store>) storeRepo.findAll();
	}

	@GetMapping(path = "/store/{storeId}")
	public Store getStoreDetails(@PathVariable(name = "storeId") int storeId) {
		List<Store> store = storeRepo.findAll();
		Store s = null;
		if (store.size() > 0) {
			s = store.get(storeId);
		}
		return s;
	}

	@PostMapping(path = "/store")
	public void addStore(@RequestBody Store store) {
		storeRepo.save(store);
	}
}
