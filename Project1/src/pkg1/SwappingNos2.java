package pkg1;
import java.util.Scanner;


public class SwappingNos2  {

	 int a;
	 int b;
	
	public static void main(String[] args) {
		
		SwappingNos2 obj3=new SwappingNos2();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value of a ");
		obj3.a=obj.nextInt();
		System.out.println("Enter value of b ");
		obj3.b=obj.nextInt();
		
	SwappingNos2 obj1=new SwappingNos2();
	obj1.a=obj3.b;
	SwappingNos2 obj2=new SwappingNos2();
	obj2.b=obj3.a;
		
		System.out.println("a =  " +obj1.a);
		System.out.println("b =  " +obj2.b);
		
	}
}
