package com.xworkz.collectionsapp.dec23;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {

	private int id;
	private String brand;
	private double price;
	private String color;
	public SanitizerDTO() {
		super();
	}
	public SanitizerDTO(int id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	//@Override
	public int compareTo(SanitizerDTO s)
	{
		if (price > s.price) {
			return 1;
		}
		else if (price == s.price) {
			return 0;
		}
		else {
			return -1;
		}
	}
	



}
