package pkg1;

import java.util.Scanner;

public class tableprint {

	int n;
	
	public void table(int n) {
		
		int i=1;
		while(i<=10) {
			
			
			int number=n*i;
			
			System.out.println(+number);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		tableprint obj=new tableprint();
		Scanner obj1=new Scanner(System.in);
		 System.out.println("Please enter a no. for table");
		  obj.n=obj1.nextInt();
		  obj.table(obj.n);
		  
		obj1.close();
	}
	
}
