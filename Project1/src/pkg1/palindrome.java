package pkg1;

import java.util.Scanner;

public class palindrome {
	
	int reverse=0;
	public boolean Palincheck(int n) {
		int number=n;
		while(number!=0) {
			
			int remainder = number%10;
			 reverse=reverse*10 + remainder;
			 number=number/10;
		}
		System.out.println("reverse is " + reverse);
		if(reverse==n) {
			return true;}
			
			else{
				return false;
			
		}
	}
	

	public static void main(String[] args) {
		
		palindrome obj=new palindrome();
		
		Scanner obj1=new Scanner(System.in);
		
		System.out.println("please enter a no. to verify palindrome");
		
		int n=obj1.nextInt();
		
		if(obj.Palincheck(n)) {
			System.out.println("it is a palindrome");
		}
			else {
				System.out.println("it is not a palindrome");
			}
		
			obj1.close();
		}
		
		
	}
	


