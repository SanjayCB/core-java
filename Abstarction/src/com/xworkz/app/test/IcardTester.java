package com.xworkz.app.test;

import com.xworkz.app.HdfcBank;
import com.xworkz.app.Icard;
import com.xworkz.app.IciciBank;
import com.xworkz.app.SbiBank;

public class IcardTester {
	public static void main(String args[]) {
		Icard card=new SbiBank();	
		card.swipe();
		Icard card1=new HdfcBank();
		card1.swipe();
		Icard card2=new IciciBank();
		card2.swipe();
	}

}
