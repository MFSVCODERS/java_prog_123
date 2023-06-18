package methods;

public class calculators {
	public int add(int x,int y) {
		int z=x+y;
		System.out.println(z);
		return z;
		
	}
	public int sub(int z,int b) {
		int c=z-b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		calculators c=new calculators();
		
		int z=c.add(10, 20);
		c.sub(z, 10);
		
		
		
	}
	

}
