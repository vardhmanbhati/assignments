package pkg1;

public class Day7_1 extends Day7{
	public Day7_1() {
		super(1,2);
		System.out.println("this is child default contructor");
	}
	public Day7_1(int a) {
		this(1,2,3);
		System.out.println("this is child 1 parameterised contructor");
	}
	public Day7_1(int a,int b) {
		this(1);
		System.out.println("this is child 2 parameterised contructor");
	}
	public Day7_1(int a,int b, int c) {
		this();
		System.out.println("this is child 3 parameterised contructor");
	}

	public static void main(String[] args) {
		Day7_1 obj=new Day7_1(1,2);
		
	}
}
