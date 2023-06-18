package student;

public class student {
	String name;
	int age;
	String DOB="01/01/2003";
	double height=6.2;
	long mobno=8105600798l;
	char sec='a';
	double weight=80;
	String email="dinga123@gmail.com";
	
	public static void main(String[] arg) {
		student s=new student();
		s.name="dinga";
		s.age=25;
		
		System.out.println(s);
		System.out.println(s.name +" "  +  "age is:" +  s.age);
		student s1=new student();
		s1.name="moni";
		s1.age=20;
		
		System.out.println(s1.name +" "  +  "age is:" +  s1.age);
		
		
	}
	
	
	
			

}
