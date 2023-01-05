package com.xworkz.collectionsapp.equalsMethodDTO;

import java.util.ArrayList;
import java.util.Collection;

public class PlceDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceDTO dto=new PlaceDTO("JOGFALLS","SHIVAMOGGA","FALLS");
		PlaceDTO dto1=new PlaceDTO("MALPE","MANGALORE","BEACH");
			
		PlaceDTO dto3=new PlaceDTO("AGUMBE","THIRTHAHALLI","SUNSET");
		PlaceDTO dto4=new PlaceDTO("SHRINGERI","CHIKKAMAGALURU","TEMPLE");
		PlaceDTO dto5=new PlaceDTO("KAVISHAILA","THIRTHAHALLI","KUVEMPU HOUSE");
		
		
		
		System.out.println(dto5.equals(dto3));System.out.println("============================================================");
		System.out.println(dto.equals(dto3));System.out.println("============================================================");
		System.out.println(dto3.equals(dto3));System.out.println("============================================================");
		
		
		Collection<PlaceDTO> col=new <PlaceDTO>ArrayList();
		col.add(dto);col.add(dto1);col.add(dto3);col.add(dto4);col.add(dto5);
		//System.out.println(col);
		//col.contains(dto1);col.contains(dto3);
		System.out.println(col);
		
		System.out.println(col);
		
		

	}

}
