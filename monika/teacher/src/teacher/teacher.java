package teacher;

public class teacher {
	String name;
	int age;
	String DOB="01/01/2003";
	double height=5.2;
	long mobno=8105600798l;
	long yearofex;
	double weight=50;
	String email="dinga123@gmail.com";
	
	public static void main(String[] arg) {
		teacher t1= new teacher();
		t1.name="Manjula";
		t1.age=30;
		t1. yearofex=5;
		System.out.println(t1.name +" "  +  "age is:" +  t1.age + " " + "year of experience" +" " + t1.yearofex);
		teacher t2= new teacher();
		t2.name="Monika";
		t2.age=21;
		t2. yearofex=1;
		System.out.println(t2.name +" "  +  "age is:" +  t2.age + " " + "year of experience" + " " +  t2.yearofex);
		teacher t3= new teacher();
		t3.name="Raj";
		t3.age=40;
		t3. yearofex=10;
		teacher t4= new teacher();
		System.out.println(t3.name +" "  +  "age is:" +  t3.age + " " + "year of experience" + " " +  t3.yearofex);
		t4.name="priya";
		t4.age=25;
		t4. yearofex=3;
		System.out.println(t4.name +" "  +  "age is:" +  t4.age + " " + "year of experience" + " " +  t4.yearofex);
		teacher t5= new teacher();
		t5.name="priyaraj";
		t5.age=25;
		t5. yearofex=3;
		System.out.println(t5.name +" "  +  "age is:" +  t5.age + " " + "year of experience" + " " +  t5.yearofex);
		
		
		
	}
	

}
