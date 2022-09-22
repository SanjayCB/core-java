class Theatre
{
static long priceOfKannadaMovies[] = {1000,150,150,900000l};
static int priceOfHindiMovies[] = {1000,150,150,200};
static int priceOfEnglishMovies[] = {1000,150,150,200};
 static String movieName[]={"KGF Franchise's","Googly","Sampathige sawaal","Om"};
 static String hindiMovies[]={"3 idiots","PK","Bajarangi Baijan","DDlJ"};
 static String EnglishMovies[]={"Avangers","Fast and feaurios","the loki","The Conjuring"};
 public static void main(String args[])
 {
	  
   System.out.println("\nList of Kannda movie names");
   System.out.println(" "+movieName[0]+" :- "+priceOfKannadaMovies[0]);
   System.out.println(" "+movieName[1]+" :- "+priceOfKannadaMovies[1]);
   System.out.println(" "+movieName[2]+" :- "+priceOfKannadaMovies[2]);
   System.out.println(" "+movieName[3]+" :- "+priceOfKannadaMovies[3]+"\n");
   System.out.println("The Hindi Movies");
 for(int i=0;i<=3;i++)
   {
	 System.out.println(" "+hindiMovies[i]+":-"+priceOfHindiMovies[i]);     	 
   }
   System.out.println("\nThe English Movies");
   for(int a=0;a<=3;a++)
   {
	   System.out.println(" "+EnglishMovies[a]+":-"+priceOfEnglishMovies[a]);
   }
   
 }
 
}