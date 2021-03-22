package pkg1;

public class pattern5 {

	public void loop()
	{
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				
				
				System.out.print(" ");
				
			}
				for(int k=1;k<=i;k++) {
					
					System.out.print("*");
				
				
			}
			
				System.out.println();
			
		}
		
		
	}
	
	
public static void main(String[] args) {
		
		pattern5 obj=new pattern5();
		
		obj.loop();
}
	
}
