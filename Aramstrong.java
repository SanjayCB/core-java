
package com.xworkz.app;
import java.util.*;

public class Aramstrong {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the armstrong number");
	int n=s.nextInt();
	int temp=n;
	int arm=0;
	int rem=0;
	while(n>0)
	{
		rem=n%10;
		arm=(arm)+(rem*rem*rem);
		n=n/10;
		
	}
	if(temp==arm)
	{
		System.out.println(temp+" is AramStrong number");
		
	}
	else {
		System.out.println("Not a aram strong number");
	}
}

}
