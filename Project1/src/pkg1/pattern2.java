package pkg1;

public class pattern2 {

	public void loop()
	{
		
		for(int i=4;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		pattern2 obj=new pattern2();
		
		obj.loop();
}}
