/**
 * 
 */
package com.adi.storedetail.pojo;

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

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int storeId;
	
	@Column
	private String name;

	public int getId() {
		return storeId;
	}

	public void setId(int id) {
		this.storeId = id;
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

	public Store(int id, String name) {
		this.storeId = id;
		this.name = name;
	}

	public Store() {
	}
}
