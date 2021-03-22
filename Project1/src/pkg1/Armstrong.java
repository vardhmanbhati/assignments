package pkg1;

import java.util.Scanner;

public class Armstrong {
	int n;
	int arm=0;
	public int Armcheck(int n){
		int number=n;
		while(number!=0) {
			
			int remainder=number%10;
			arm = arm + (remainder*remainder*remainder);
			number = number/10;
			 
			 
		}
		return arm;
	}
	
	public static void main(String[] args) {
		 Armstrong obj=new Armstrong();
		 
		 Scanner obj1=new Scanner(System.in);
		 System.out.println("Please enter a no.");
		  obj.n=obj1.nextInt();
		   System.out.println("armstrong no. is " +obj.Armcheck(obj.n));
		  
		   obj1.close();
	}
	
}
