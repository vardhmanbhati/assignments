package pkg1;

public class A10 {
	
	public void  A10m() {
		this.A10m(1,2,3);
		System.out.println("this is parent default contructor");
	}
	public void A10m(int a) {
		this.A10m();
		System.out.println("this is parent 1 parameterised contructor");
	}
	public void  A10m(int a,int b) {
		this.A10m(1);
		System.out.println("this is parent 2 parameterised contructor");
	}
	public void  A10m(int a,int b, int c) {
		System.out.println("this is parent 3 parameterised contructor");
	}

	}

