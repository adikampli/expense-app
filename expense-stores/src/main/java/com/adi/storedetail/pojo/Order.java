package com.adi.storedetail.pojo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "orders")
public class Order {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@ManyToOne
	@JoinColumn(name = "storeId")
	private Store store;

	@OneToMany
	@JoinTable(name = "order_items", joinColumns = {
			@JoinColumn(name = "orderId", referencedColumnName = "orderId") }, inverseJoinColumns = {
					@JoinColumn(name = "productId", referencedColumnName = "productId") })
	private List<Product> orderItems;

	@Column
	private float total;

	@Column
	private Date orderDate;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public List<Product> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Product> orderItems) {
		this.orderItems = orderItems;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", store=" + store + ", orderItems=" + orderItems + ", total=" + total
				+ ", orderDate=" + orderDate + "]";
	}

	public Order(int orderId, Store store, List<Product> orderItems, float total, Date orderDate) {
		this.orderId = orderId;
		this.store = store;
		this.orderItems = orderItems;
		this.total = total;
		this.orderDate = orderDate;
	}

	public Order() {
	}
}
