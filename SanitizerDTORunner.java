package com.xworkz.collectionsapp.dec23;

import java.util.Collection;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerDTORunner {


	public static void main(String[] args) {

		SanitizerDTO san=new SanitizerDTO(001,"Wipro",132.50,"RED");
		SanitizerDTO san1=new SanitizerDTO(012,"lifeBoy",178.50,"Green");
		SanitizerDTO san2=new SanitizerDTO(023,"dettol",208.000,"RED");
		SanitizerDTO san3=new SanitizerDTO(034,"savlon",241.00,"BLUE");
		SanitizerDTO san4=new SanitizerDTO(045,"Wellcare",252.50,"YELLOW");
		SanitizerDTO san5=new SanitizerDTO(067,"Sterillium",182.00,"PINK");
		SanitizerDTO san6=new SanitizerDTO(075,"Himalaya",98.50,"BLUE");
		SanitizerDTO san7=new SanitizerDTO(101,"Purell",132.000,"RED");
		SanitizerDTO san8=new SanitizerDTO(112,"Instant",350.00,"CREAM");
		SanitizerDTO san9=new SanitizerDTO(121,"Mediker",311.50,null);

		System.out.println("======================================================================================================");
		System.out.println(san);
		System.out.println(san1);
		System.out.println(san2);
		System.out.println(san3);
		System.out.println(san4);

		System.out.println(san5);
		System.out.println(san6);
		System.out.println(san7);

		System.out.println(san8);	System.out.println(san9);

		Collection<SanitizerDTO> sanit=new LinkedList  ();
		sanit.add(san);
		sanit.add(san1);
		sanit.add(san2);
		sanit.add(san3);
		sanit.add(san4);
		sanit.add(san5);
		sanit.add(san6);
		sanit.add(san7);
		sanit.add(san8);
		sanit.add(san9);



		System.out.println("======================================================================================================");
		System.out.println("...............................SANITIZER PRICE IS GRETERTHEN 100......................................");
		Iterator<SanitizerDTO> iter1=sanit.iterator();
		while(iter1.hasNext())
		{
			SanitizerDTO ele=iter1.next();
			if(ele.getPrice()>100)
			{
				System.out.println("NAME: "+ele);
			}

		}
		System.out.println("======================================================================================================");
		System.out.println("...............................Checking if any Property is NULL.......................................");
		Iterator<SanitizerDTO> iter2=sanit.iterator();
		while(iter2.hasNext())
		{
			SanitizerDTO ele1=iter2.next();
			if(ele1.getId()==0 || ele1.getBrand()=="" || ele1.getPrice()==0 || ele1.getColor()==null)
			{
				System.out.println(ele1);
			}

		}		
		System.out.println("======================================================================================================");

		System.out.println("....................................REmovIng RED GREEN BLUE COLOR SANITIZERS.........................");

		Iterator<SanitizerDTO> iter3=sanit.iterator();

		while(iter3.hasNext())
		{
			SanitizerDTO ele=iter3.next();     
			if(ele.getColor()=="GREEN" || ele.getColor()=="RED" || ele.getColor()=="BLUE" )
			{

				iter3.remove();
				System.out.println(ele+" : REMOVED");

			}

		}
		System.out.println("======================================================================================================");
		System.out.println("..................................LEAST PRICE SANITIZER.........................");
		Collection<Double> sanitPrice=new LinkedList();
		Iterator<SanitizerDTO> price=sanit.iterator();
		while(price.hasNext())
		{
			sanitPrice.add(price.next().getPrice());
		}
		//Collections.sort(sanitPrice);



		System.out.println("======================================================================================================");

		System.out.println("======================================================================================================");



	}

}