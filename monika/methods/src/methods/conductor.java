package methods;

public class conductor {
	ticket sell() {
		ticket p=new ticket();
		System.out.println("ticket is issued");
		return p;
		
	}
	public static void main(String[] args) {
		conductor s=new conductor();
		s.sell();
	}

}

