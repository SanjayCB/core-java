package com.xworkz.collectionsapp;

import java.io.Serializable;

public class AirportDTO implements Serializable {

private String name;
private String place;
private String airportType;
public AirportDTO() {
	
}
public AirportDTO(String name, String place, String airportType) {
	super();
	this.name = name;
	this.place = place;
	this.airportType = airportType;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getAirportType() {
	return airportType;
}
public void setAirportType(String airportType) {
	this.airportType = airportType;
}
@Override
public String toString() {
	return "AirportDTO [name=" + name + ", place=" + place + ", airportType=" + airportType + "]";
}
@Override

public boolean equals(Object obj)
{
	boolean rtn=false;
	if(obj!=null)
	{
		AirportDTO dto=(AirportDTO)obj;
		if(dto.name.equals(this.name))
		{
			System.out.println("it is equal "+dto.name);
			rtn=true;
		}
		if(dto.place.equals(this.place))
		{
			System.out.println("it is equal "+dto.place);
			rtn=true;
		}
		if(dto.airportType.equals(this.airportType))
		{
			System.out.println("it is equal "+dto.airportType);
			rtn=true;
		}
		
	}
	return rtn;
}

}
