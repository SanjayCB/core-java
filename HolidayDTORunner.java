/**
 * 
 */
package com.xworkz.collectionsapp.dec28;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author DELL
 *
 */
public class HolidayDTORunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HolidayDTO hd1 = new HolidayDTO("Sunday","Weekend","EveryMonth");
		HolidayDTO hd2 = new HolidayDTO("Independence Day","National Festival","AUGUST 15");
		HolidayDTO hd3 = new HolidayDTO("Republic Day","National Festival","JANUARY 26");
		HolidayDTO hd4 = new HolidayDTO("Gandi Jayanthi"," National Festival","NOVEMBER 02");
		HolidayDTO hd5 = new HolidayDTO("Makara Sankranthi","Indian Festival","January 15");
		HolidayDTO hd6 = new HolidayDTO("Sunday","Weekend","EveryMonth");

		boolean equals= hd1.equals(hd2);
		System.out.println(equals);
		System.out.println();

		System.out.println("-----------------------------------------------------------------------------");

		Collection<HolidayDTO> col = new ArrayList<HolidayDTO>();
		col.add(hd1);
		col.add(hd2);
		col.add(hd3);
		col.add(hd4);
		col.add(hd5);

		col.contains(hd5);
		col.contains(hd4);
		col.contains(hd3);
		col.contains(hd2);
		col.contains(hd1);

	}

}
