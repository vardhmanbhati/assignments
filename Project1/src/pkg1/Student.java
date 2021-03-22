package pkg1;

public class Student {

	int age;
	int rollno;
	
	public void display1() {
		System.out.println("Welcome All");
		
	}
	public void display2() {
		System.out.println("Automation is Easy");
		
	}
	public static void main(String[] args) {
		
		Student deepak=new Student();
	deepak.age=30;
	deepak.rollno=123456;
	
	System.out.println(deepak.age);
	System.out.println(deepak.rollno);
	
	deepak.display1();
	deepak.display2();
	
	}
	
}
