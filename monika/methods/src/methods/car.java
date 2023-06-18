package methods;

public class car {
     void start() {
    	 System.out.println("Car start");
     }
     void gear() {
    	 System.out.println("shift gear");
     }
     void move() {
    	 start();
    	 gear();
    	 System.out.println("Car is moving");
     }
}
