package pkg1;

public class task4 {
	
	public task4() {
		this(1,2,3);
		System.out.println("this is default contructor");
	}
	public task4(int a)
	{this(1,2);
		System.out.println("this is 1 parameter contructor");
	}
	public task4(int a,int b) {
		this(1,2,3,4);
		System.out.println("this is 2 parameter contructor");
	}
	public task4(int a,int b,int c){
		
		System.out.println("this is 3 parameter contructor");
	}
	public task4(int a,int b,int c,int d) {
		this();
		System.out.println("this is 4 parameter contructor");
	}
	
public static void main(String[] args) {
	task4 obj=new task4(1);
	
}
}
