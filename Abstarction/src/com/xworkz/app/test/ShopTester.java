package com.xworkz.app.test;

import com.xworkz.app.BikeService;
import com.xworkz.app.HdfcBank;
import com.xworkz.app.Icard;
import com.xworkz.app.SbiBank;
import com.xworkz.app.Shop;

public class ShopTester {
	public static void main(String args[])
	{
		//Abstarction
		Shop shop=new BikeService();
		shop.doBusiness();	
		Icard ic=new HdfcBank();
		ic.swipe();
		Icard ia=new SbiBank();
		ia.swipe();
		
		
	}

}
