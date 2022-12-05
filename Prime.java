import java.util.*;
class Prime
{
 public static void main(String args[])
 {
	 int n;
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("enter the number");
	 n=s.nextInt();
  int i,flag=0;
  
  if(n==0||n==1)
  {
  System.out.println(n+" is not a prime number");
  }
  else
  {
  for(i=2;i<=n/2;i++)
  {
  if(n%i==0)
  {
  System.out.println(n+" is not a prime number");
  flag=1;
  break;
  }
  }
  if(flag==0)
  {
  System.out.println(n+" is a prime number");
  }
  }
 }
}