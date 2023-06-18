package add;

import java.util.Scanner;

public class addition {
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter 2 numbers");
	  int a=scan.nextInt();
	  int b=scan.nextInt();
	  int c=a+b;
	  System.out.println("addition of 2 numbers is:" +c);
  }
}
