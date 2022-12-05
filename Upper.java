package com.xworkz.app;

public class Upper {
	public static void main(String args[])
	{
 String array[]= {"a","b","c","d"};
 for(int i=0;i<array.length;i++)
 {
	 for(int j=0;j<i;j++)
	 {
         System.out.print(array[i]);	 
     }
	 System.out.println(array[i]);
 }
	}
}
