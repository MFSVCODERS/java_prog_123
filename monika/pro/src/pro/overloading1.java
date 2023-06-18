package pro;

public class overloading1 {
 
	public int jio (int x , int y) {
		int i=x+y;
	
			System.out.print(i);
			return i;
		
	}
	
	public int jio (int x , int y, int z) {
		int i=x+y+z;
	
			System.out.print(i);
			return i;
		
	}
	
	public double jio (double x , int y) {
		double i=x+y;
	
			System.out.print(i);
			return i;
		
	}
	
	void jio () {
		
				System.out.print("no amount");
			
		
	}
}
