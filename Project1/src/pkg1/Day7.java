package pkg1;

public class Day7 {

public Day7() {
	this(1,2,3);
	System.out.println("this is parent default contructor");
}
public Day7(int a) {
	this();
	System.out.println("this is parent 1 parameterised contructor");
}
public Day7(int a,int b) {
	this(1);
	System.out.println("this is parent 2 parameterised contructor");
}
public Day7(int a,int b, int c) {
	System.out.println("this is parent 3 parameterised contructor");
}

}
