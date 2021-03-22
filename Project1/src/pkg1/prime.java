package pkg1;

import java.util.Scanner;

public class prime {
	long a;
	long i;
	
	public void PrimeCheck() {
		
		if(a==1||a==2) {
			System.out.println(a+ " is a prime no.");
		}
		
		for (i=2; i<a;i++ )
		{
			double x=a%i;
			
			if(x==0) {
				System.out.println(a+ " is not a prime no.");
				break;
				
			}
				else if(x!=0){
					System.out.println(a+ " is a prime no.");
					break;
				}
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		prime obj1=new prime();
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter a no.");
		obj1.a=obj.nextLong();
		obj1.PrimeCheck();
		
		
	}

}
