package com.xworkz.app.test;

import com.xworkz.app.Switch.DiscoLight;
import com.xworkz.app.Switch.Switch;
import com.xworkz.app.Switch.TublightImpl;

public class SwitchTester {
	public static void main(String args[])
	{
		Switch s=new TublightImpl();
		s.on();
		s.off();
		Switch d=new DiscoLight();
	d.on();
	d.off();
	}

}
