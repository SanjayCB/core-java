package com.xworkz.collectionsapp;

import java.io.Serializable;

public class CalenderDTO implements Serializable {
	private String name;
	private String type;
	private double price;
	public CalenderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CalenderDTO(String name, String type, double price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		boolean ret=false;
		if(obj!=null)
		{
			CalenderDTO cal=(CalenderDTO)obj;
			if(cal.name.equals(this.name))
			{
				System.out.println("iddu idde");
				ret=true;
			}
			if(cal.name.equals(this.name))
			{
				System.out.println("iddu idde");
				ret=true;
			}
			if(cal.name.equals(this.name))
			{
				System.out.println("iddu idde");
				ret=true;
			}
			
		}
		return ret;
	}

}
