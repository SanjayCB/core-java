package com.xworkz.collectionsapp;
import java.util.*;
public class AirportDTORunner {
	

	public static void main(String[] args) {
		AirportDTO airport1=new AirportDTO("KempegowdaBanglore","Banglore","International");
		AirportDTO airport2=new AirportDTO("MangaluruAirport","Mangaluru","International");
		AirportDTO airport3=new AirportDTO("BelagaviAirport","Belagavi","National");
		AirportDTO airport4=new AirportDTO("KempegowdaBanglore","Banglore","International");
		
		System.out.println("*****"+airport1.equals(airport4)+"***** \n");
		System.out.println("+++++"+airport1.equals(airport2)+"+++++ \n");
		System.out.println("-----"+airport1.equals(airport3)+"----- \n");
		
		Collection<AirportDTO> airport=new ArrayList<AirportDTO>();
		airport.add(airport1);
		airport.add(airport2);
		airport.add(airport3);
		airport.add(airport4);
		
		System.out.println(airport+"\n");
		System.out.println(airport.contains(airport1));
		
		
	}

}
