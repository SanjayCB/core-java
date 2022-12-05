class Fib
{
  public static void main(String args[])
  {
	  int a=0;
	  int b=1;
	  int c;
	  System.out.println("\n"+a+"\n"+b+"\n");
	  for(int i=2;i<10;i++)
	  {
		  c=a+b;
		  System.out.println(c+"\n");
		  a=b;
		  b=c;
	  }
  }
}