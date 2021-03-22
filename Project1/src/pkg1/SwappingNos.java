package pkg1;

public class SwappingNos {

	int a=23;
	int b=16;
	int c=5;
	
	public static void main(String[] args) {
		
		SwappingNos obj=new SwappingNos();
		
		System.out.println("a =  " +obj.a);
		System.out.println("b =  " +obj.b);
		obj.c=obj.a;
		obj.a=obj.b;
		obj.b=obj.c;
		
		System.out.println("a =  " +obj.a);
		System.out.println("b =  " +obj.b);
		
		
	}
	
	
	
}
