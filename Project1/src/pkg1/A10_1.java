package pkg1;

public class A10_1 extends A10 {
	
	public void A10_1m() {
		super.A10m(1,2);
		System.out.println("this is child default contructor");
	}
	public void  A10_1m(int a) {
		this.A10_1m(1,2,3);
		System.out.println("this is child 1 parameterised contructor");
	}
	public void  A10_1m(int a,int b) {
		this.A10_1m(1);
		System.out.println("this is child 2 parameterised contructor");
	}
	public void  A10_1m(int a,int b, int c) {
		this.A10_1m();
		System.out.println("this is child 3 parameterised contructor");
	}

	public static void main(String[] args) {
		A10_1 obj=new A10_1();
		obj.A10_1m(1,2);
		
	}
}

