package methods;

public class calculator {
String name="casio";
String color="black";

public int add(){
	int a=2;
	int b=3;
	int c=a+b;
	System.out.println("Addition of two numbers:"+" " +c);
	return c;
}
public double sub(){
	double a=2.5;
	int b=1;
	double c=a-b;
	System.out.println("Subtraction of two numbers:"+ " " +c);
	return c;
}
public int mul(){
	int a=2;
	int b=3;
	int c=a*b;
	System.out.println("Multiplication of two numbers:"+" " +c);
	return c;
}
public double div(){
	double a=10.0;
	int b=5;
	double c=a/b;
	System.out.println("Division of two numbers:"+" " +c);
	return c;
}
	
	public static void main(String[] args) {
		calculator c=new calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
}
}

