package pkg1;

import java.util.Scanner;

public class factorial {

	int n;
	
	public void fact(int n){
		
		int number=n;
		
		for(;n>1;n--)
		{
		
		number=number*(n-1);
		}			
		
		System.out.println(+number);
	}
	
	
	
public static void main(String[] args) {
		
		factorial obj=new factorial();
		Scanner obj1=new Scanner(System.in);
		 System.out.println("Please enter a no.");
		  obj.n=obj1.nextInt();
		  obj.fact(obj.n);
		  
		obj1.close();
}}
