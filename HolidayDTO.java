/**
 * 
 */
package com.xworkz.collectionsapp.dec28;

import java.io.Serializable;

/**
 * @author DELL
 *
 */
public class HolidayDTO implements Serializable{
	
	private String name;
	private String purpose;
	private String month;
	/**
	 * 
	 */
	public HolidayDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param airportType
	 * @param place
	 */
	public HolidayDTO(String name, String purpose, String month) {
		super();
		this.name = name;
		this.purpose = purpose;
		this.month = month;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto =(HolidayDTO) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matching " +dto.name);
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}
	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "HolidayDTO [name=" + name + ", purpose=" + purpose + ", month=" + month + "]";
	}
	
	

}
