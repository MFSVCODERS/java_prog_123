package methods;

public class cal {
	public int add(int a,int b){
		int c=a+b;
		System.out.println("Addition of two numbers:"+" " +c);
		return c;
	}
	public double sub(double a,int b){
		double c=a-b;
		System.out.println("Subtraction of two numbers:"+" " +c);
		return c;
	}
	public int mul(int a,int b){
		int c=a*b;
		System.out.println("Multiplication of two numbers:"+" " +c);
		return c;
	}
	public double div(double a,int b){
		double c=a/b;
		System.out.println("Division of two numbers:"+" " +c);
		return c;
	}
		
		public static void main(String[] args) {
			cal c=new cal();
			c.add(5,6);
			c.add(8,9);
			c.sub(5.2,1);
			c.sub(100.0, 10);
			c.mul(2, 3);
			c.div(10.0, 5);

		}
}
