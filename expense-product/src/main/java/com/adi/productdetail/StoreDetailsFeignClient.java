package com.adi.productdetail;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.adi.productdetail.pojo.Store;

@FeignClient(name = "expense-store")
public interface StoreDetailsFeignClient {

	@GetMapping(path = "/store/{storeId}")
	public Store getStoreDetails(@PathVariable(name = "storeId") int storeId);
}
