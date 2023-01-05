package com.xworkz.collectionsapp.jan5;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class WeponDTORunner {
	 
	public static void main(String[] args) {

		WeponsDTO wepon1=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2011,05,12),200,WeponType.Pistol);
		WeponsDTO wepon2=new WeponsDTO("Glock","INDIA",LocalDate.of(1999,05,12),1000,WeponType.Pistol);
		WeponsDTO wepon3=new WeponsDTO("12Bore PAG","INDIA",LocalDate.of(1911,05,12),3000,WeponType.Artillery);
		WeponsDTO wepon4=new WeponsDTO("KochMP5","Heckler",LocalDate.of(1999,05,12),2300,WeponType.SubmachineGun);
		WeponsDTO wepon5=new WeponsDTO("Micro-UZI","USA",LocalDate.of(2010,05,12),21000,WeponType.MachineGun);
		WeponsDTO wepon6=new WeponsDTO("1B1 INSAS","Germani",LocalDate.of(2010,05,12),2000,WeponType.Artillery);
		WeponsDTO wepon7=new WeponsDTO("SIG-7161","Japan",LocalDate.of(2010,05,12),43423,WeponType.BattleRifle);
		WeponsDTO wepon8=new WeponsDTO("SteyrSSG69","INDIA",LocalDate.of(2010,05,12),2221,WeponType.Pistol);
		WeponsDTO wepon9=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),76544,WeponType.Pistol);
		WeponsDTO wepon10=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),44333,WeponType.Pistol);
		WeponsDTO wepon11=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),2333,WeponType.Pistol);
		WeponsDTO wepon12=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),20600,WeponType.Pistol);
		WeponsDTO wepon13=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),43223,WeponType.Pistol);
		WeponsDTO wepon14=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),98766,WeponType.Pistol);
		WeponsDTO wepon15=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),12333,WeponType.Pistol);
		WeponsDTO wepon16=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),2222,WeponType.Pistol);
		WeponsDTO wepon17=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),43222,WeponType.Pistol);
		WeponsDTO wepon18=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),23432,WeponType.Pistol);
		WeponsDTO wepon19=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),23455,WeponType.Pistol);
		WeponsDTO wepon20=new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2010,05,12),2000,WeponType.Pistol);
		
		Collection<WeponsDTO> weapon=new ArrayList<WeponsDTO>();
		weapon.add(wepon1);
		weapon.add(wepon2);
		weapon.add(wepon3);
		weapon.add(wepon4);
		weapon.add(wepon5);
		weapon.add(wepon6);
		weapon.add(wepon7);
		weapon.add(wepon8);
		weapon.add(wepon9);
		weapon.add(wepon10);
		weapon.add(wepon11);
		weapon.add(wepon12);
		weapon.add(wepon13);
		weapon.add(wepon14);
		weapon.add(wepon15);
		weapon.add(wepon16);
		weapon.add(wepon17);
		weapon.add(wepon18);
		weapon.add(wepon19);
		weapon.add(wepon20);
		
		for(WeponsDTO weponss:weapon)
		{
			System.out.println(weponss);
		}
		
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.filter((a)->{return a.getPrice()>10000;})
		.collect(Collectors.toList())
		.forEach(a->System.out.println(a.getPrice()+" "+a.getName()));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.map((a)->{return a.getName().toLowerCase();})
		.collect(Collectors.toList())
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.forEach(a->System.out.println("MadeBy : "+a.getMadeBy()+"..... MadeOn : "+a.getMadeOn()));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->a.getName().compareTo(b.getName()))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->a.getMadeBy().compareTo(b.getMadeBy()))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->a.getMadeOn().compareTo(b.getMadeOn()))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->Integer.compare(a.getPrice(), b.getPrice()))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->Integer.compare(b.getPrice(), a.getPrice()))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->a.getMadeOn().compareTo(b.getMadeOn()))
		.forEach(a->System.out.println(a));
		
		Comparator<WeponsDTO> compares=(a,b)->a.getMadeOn().compareTo(b.getMadeOn());
		Comparator<WeponsDTO> compare11=(a,b)->a.getName().compareTo(b.getName());
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted(compares.thenComparing(compare11))
		.forEach(a->System.out.println(a));
		
		System.out.println("\n+++++++++++++++++++++++");
		weapon.stream()
		.sorted((a,b)->b.getName().compareTo(a.getName()))
		.forEach(a->System.out.println(a));
		
		
		
	}

}
