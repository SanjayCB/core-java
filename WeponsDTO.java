package com.xworkz.collectionsapp.jan5;

import java.io.Serializable;
import java.time.LocalDate;

public class WeponsDTO implements Serializable,Comparable<WeponsDTO>{
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private int price;
	private WeponType type;
	public WeponsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeponsDTO(String name, String madeBy, LocalDate madeOn, int price, WeponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public LocalDate getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public WeponType getType() {
		return type;
	}
	public void setType(WeponType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "WeponsDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	@Override
	public int hashCode()
	{
		return 30;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof WeponsDTO)
			{
				WeponsDTO wepon=(WeponsDTO)obj;
				if(wepon.name.equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(WeponsDTO o) {
		return this.name.compareTo(name);
	}
	
	
	

}
