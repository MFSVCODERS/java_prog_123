package methods;

public class Airtel {
	void payBill(long cardno, String exDate,int cvv) {
		System.out.println("Recharge through card");
	}
	void payBill(long mobile,String pin) {
		System.out.println("Recharge through UPI");
	}
	void payBill(String un,String pwd) {
		System.out.println("Recharge through net bank");
	}

}
