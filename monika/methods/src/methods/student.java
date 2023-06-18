package methods;

public class student {
String name;
int age=20;
public void sleep() {
	System.out.println(name+" "+"is sleeping");
	
	
}
public static void main(String[] args) {
	student s=new student();
	s.name="dinga";
	s.sleep();
	student s1=new student();
	s1.name="moni";
	s1.sleep();
	System.out.println(s1.name+" "+"is sleeping");
	
	
}
}
