package pkg1;

public class pattern6 {

	public void loop()
	{
		
		for(int i=1;i<=5;i++) {
			int m=(2*i-1);
			for(int j=5;j>=i;j--) {
				
				
				System.out.print(" ");
				
			}
			
				for(int k=1;k<=m;k++) {
					
					System.out.print("*");
				
				
			}
			
				System.out.println();
			
		}
		
		
	}
	
	
public static void main(String[] args) {
		
		pattern6 obj=new pattern6();
		
		obj.loop();
}
	

}
