package com.xworkz.app;

import java.util.*;

class Reverse
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
int n=s.nextInt();
int reverse=0;
while(n!=0)
{
int remainder=n%10;
reverse=reverse*10+remainder;
n=n/10;
}
System.out.println("Reverse number is "+reverse);
}
}