package com.adi.orderdetail.repository;

import org.springframework.data.repository.CrudRepository;

import com.adi.orderdetail.pojo.Order;

public interface OrdersRepository extends CrudRepository<Order, Integer> {

}
