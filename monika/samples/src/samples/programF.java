package samples;

import java.util.Scanner;

public class programF {
	public static void main(String[] args)
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter a numbers");
		  int n=scan.nextInt();
		  if(n>0) {
			  while(n>0) {
			  System.out.printf("*"); 
			  n=n-1;
			  System.out.println(" ");
		  }
		  
		  }
}
}
