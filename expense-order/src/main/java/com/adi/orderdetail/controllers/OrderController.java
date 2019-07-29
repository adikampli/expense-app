package com.adi.orderdetail.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adi.orderdetail.pojo.Order;
import com.adi.orderdetail.repository.OrdersRepository;

@RestController
public class OrderController {

	@Autowired
	private OrdersRepository ordersRepo;
	
	@GetMapping(path="/order")
	public List<Order> getOrders(){
		return (List<Order>)ordersRepo.findAll();
	}
	
	@PostMapping(path="/order")
	public void addOrder(@RequestBody Order order) {
		ordersRepo.save(order);
	}
}
