package com.captsone.cloths.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	private String Product_name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  Product_id;
	private long  Product_price;
	private String Product_Brand;
	private int Quantity;
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public long getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(long product_price) {
		Product_price = product_price;
	}
	public String getProduct_Brand() {
		return Product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		Product_Brand = product_Brand;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
