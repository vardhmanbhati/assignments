package pkg1;

public class pattern4 {

int k=1;
	public void loop()
	{
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				
				System.out.print(+k);
				k++;
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		pattern4 obj=new pattern4();
		
		obj.loop();
}
	
}
