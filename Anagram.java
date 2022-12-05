package com.xworkz.app;
import java.util.*;
public class Anagram {
	public static void main(String args[])
	{
		
		String ar[]=new String[2];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String");
		for(int i=0;i<ar.length;i++)
		{
			
	       ar[i]=s.next();
	       
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		
	}

}
