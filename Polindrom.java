package com.xworkz.app;
import java.util.*;
public class Polindrom {
	
	public static void main(String args[])
	{
		int r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check polindrom or not");
		int n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is Palindrom Number");
			
		}
		else
		{
			System.out.println(temp+" is not polondrom");
		}
	}

}
