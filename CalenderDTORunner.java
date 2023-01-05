package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderDTORunner {

	public static void main(String[] args) {
		CalenderDTO cal1=new CalenderDTO("Shabaddi Matta","WallMount",60);
		CalenderDTO cal2=new CalenderDTO("Banglore","Pocket",70);
		CalenderDTO cal3=new CalenderDTO("Bagya Lakshmi","BookLet",30);
		CalenderDTO cal4=new CalenderDTO("ShivaGange","Diary",120);
		CalenderDTO cal5=new CalenderDTO("ShivaGange","Diary",120);
		
		System.out.println("*****"+cal4.equals(cal5)+"***** \n");
		System.out.println("+++++"+cal1.equals(cal2)+"+++++ \n");
		System.out.println("-----"+cal1.equals(cal3)+"----- \n");
		
		Collection<CalenderDTO> calender=new ArrayList<CalenderDTO>();
		calender.add(cal1);
		calender.add(cal2);
		calender.add(cal3);
		calender.add(cal4);
		
		System.out.println(calender+"\n");
		System.out.println(calender.contains(cal1));
		System.out.println(calender.containsAll(calender));

	}

}
