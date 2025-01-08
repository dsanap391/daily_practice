package com.ds.streams;

public class Fruits {

	String name;
	int quantity;
	
	public Fruits(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", quantity=" + quantity + "]";
	}
}
