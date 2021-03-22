package pkg1;

public class Assignment2 {

	int a;
	int b;
	
public int sum(int a,int b) {
		
		int c=a+b;
		return c;
	}
	
public int sub(int a,int b) {
		
		int c=a-b;
		return c;
	}

public int multiplication(int a,int b) {
	
	int c=a*b;
	return c;
}

public void division(int a,int b) {
	
	int c=a/b;
	System.out.println("result is " +c);
}

public static void main(String[] args) {
	
	Assignment2 calci=new Assignment2();
	
	int sumresult1=calci.sum(10,2);
	int sumresult2=calci.sum(sumresult1, 2);
	int subresult=calci.sub(sumresult2, 2);
	int multiresult=calci.multiplication(subresult,2);
	calci.division(multiresult,2);
	

	
	
}


}
