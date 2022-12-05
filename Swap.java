package com.xworkz.app;
import java.util.*;

public class Swap {


	
	public static void main(String args[])
	{
		System.out.println("enter the values of a and b");
		Scanner s=new Scanner(System.in);
		
	int a;
	int b;
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("Before Swap ");
	  System.out.println("a= "+a);
	  System.out.println("b= "+b);
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("After Swap ");
	  System.out.println("a= "+a);
	  System.out.println("b= "+b);
	}
	
	
}
