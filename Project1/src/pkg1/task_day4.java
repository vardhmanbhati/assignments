package pkg1;

import java.util.Scanner;

public class task_day4 {

	
	public int sum(int a,int b) {
		int c=a+b;
		return c;
		
	}
	
	public int sub(int a,int b) {
		int c=a-b;
		return c;
		
	}
	
	public int multi(int a,int b) {
		int c=a*b;
		return c;
		
	}
	
	public float div(int a,int b) {
		float c=a/b;
		return c;
		}
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter the values for x1,x2,x3,x4,x5,x6");

		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		int x4=sc.nextInt();
		int x5=sc.nextInt();
		int x6=sc.nextInt();
		
		task_day4 obj=new task_day4();
		int sum1=obj.sum(x1, x2);
		int sub1=obj.sub(sum1, x3);
		int sum2=obj.sum(sub1, x4);
		int mul1=obj.multi(sum2, x5);
		float div1=obj.div(mul1,x6);
		
		System.out.println("result is" +div1);
		
		sc.close();
		
		
	}
	
	
}
