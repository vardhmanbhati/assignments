package pkg1;

public class Assignment2_1 {

	int a;
	int b;
	
public void sum(int a,int b) {
		
		int c=a+b;
		System.out.println("result is "+c);
	}
	
public int sub(int a,int b) {
		
		int c=a-b;
		return c;
	}

public int multiplication(int a,int b) {
	
	int c=a*b;
	return c;
}

public int division(int a,int b) {
	
	int c=a/b;
	return c;
}

public static void main(String[] args) {
	
	Assignment2_1 calci=new Assignment2_1 ();
	int div_result=calci.division(10, 2);
	int sub_result=calci.sub(div_result, 2);
	int sub_result2=calci.sub(sub_result, 2);
	int mul_result=calci.multiplication(sub_result2, 2);
	calci.sum(mul_result,2);
	

}}
