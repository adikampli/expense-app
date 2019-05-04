/**
 * 
 */
package com.adi.orderdetail.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author adikampl
 *
 */
@Entity
public class Store {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storeId;

	@Column
	private String name;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", name=" + name + "]";
	}

	public Store(int storeId, String name) {
		this.storeId = storeId;
		this.name = name;
	}

	public Store() {
	}
}
