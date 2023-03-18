package com.xworkz.app.Switch;

public class TublightImpl implements Switch {
	
	@Override
	public void on()
	{
		System.out.println("Tublight is turn On.....");
	}

	@Override
	public void off() {
		System.out.println("Tublight is turn Off.....");
		
	}

}
