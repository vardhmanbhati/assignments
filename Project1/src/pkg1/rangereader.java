package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class rangereader {

	
	public void Rangeread(int b,int c)  throws IOException{
		
		
		File f=new File("../Project1/intro.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		String s=null;
		for(int i=1;i<=b;i++) {
			  s=bf.readLine();
			
		}
		 if(s!=null) {
				System.out.println(s);
			}
				else {
					
					System.out.println("No text on this line");
				
				
				}
		
		for(int i=1;i<=(c-b);i++) {
			  s=bf.readLine();
			  if(s!=null) {
					System.out.println(s);
				}
					else {
						
						System.out.println("No text on this line");
					
					
					}
				
			
		}
		
		
		bf.close();
	}

	
	public static void main(String[] args) throws IOException  {
		
		
		rangereader r=new rangereader();
		System.out.println("Please enter starting line number");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("Please enter ending line number");
		int c=sc.nextInt();
		r.Rangeread(b,c);
		
		sc.close();
		
		
		
	}
	
}
	
	
	

