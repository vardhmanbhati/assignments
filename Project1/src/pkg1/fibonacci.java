package pkg1;



public class fibonacci {
	int n=0;
	int number=0;
	int number1=1;
	int number2;
	public void fibo(){
		System.out.print(number+ " " +number1);
	 while(n<10)
		{

			
		  number2=number+number1;
		  System.out.print(" " +number2);
		number=number1;
		number1=number2;
		n++;
		}
	}
public static void main(String[] args) {
		
		fibonacci obj=new fibonacci();
	
		  obj.fibo();
		  
			
}}
