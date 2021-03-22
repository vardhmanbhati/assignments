package pkg1;

public class pattern1 {

	public void loop()
	{
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		pattern1 obj=new pattern1();
		
		obj.loop();
		
	}
}
