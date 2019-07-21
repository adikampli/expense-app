/**
 * 
 */
package com.adi.storedetail.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author adikampl
 *
 */
@Document
public class Store {

	@Id
	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + id + ", name=" + name + "]";
	}

	public Store(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Store() {
	}
}
