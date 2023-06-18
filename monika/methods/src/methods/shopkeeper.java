package methods;

public class shopkeeper {
	
	product sell() {
		product p=new product();
		System.out.println("product is sold");
		return p;
		
	}
	public static void main(String[] args) {
		shopkeeper s=new shopkeeper();
		s.sell();
	}

}
