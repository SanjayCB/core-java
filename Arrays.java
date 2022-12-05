package com.xworkz.app;
import java.util.*;
public class Arrays {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int array[]=new int[5];
		int i;
		System.out.println("Enter the number to arrays");
		for( i=0;i<array.length;i++)
		{	
				array[i]=s.nextInt();	
				if(array[i]==array[i])
				{
					System.out.println(array[i]);
				}
		}
	}
}
