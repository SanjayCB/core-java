package com.xworkz.app;
import java.util.*; 
public class ReverseString {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String a;
	String rev="";
	System.out.println("Enter the string");
	a=s.next();
	
	
	for(int i=a.length()-1;i>=0;--i)
	{
		 rev+=a.charAt(i);
	}
	String b=a;
	
	if(rev.equals(b))
	{
		System.out.println("It is polindram");
	}
	else
	{
		System.out.println("no it  is not polindram");
	}
	
}
		
}
