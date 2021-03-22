package pkg1;

public class task3 {
	
	public task3() {
		this(1,2,3,4);
		System.out.println(" this is a default constructor");
	}
 public task3(int a) {
	this();
	 System.out.println("this is one parameterised contructor");
	 }
public task3(int a,int b) {
	this(1,2,3);
	 System.out.println("this is two parameterised contructor");
	 }
public task3(int a,int b,int c) {
	 this(1);
	 System.out.println("this is three parameterised contructor");
	 }
public task3(int a,int b,int c,int d) {
	 
	 System.out.println("this is four parameterised contructor");
}
public static void main(String[] args) {
	 task3 obj=new task3(1,2);
}
}
