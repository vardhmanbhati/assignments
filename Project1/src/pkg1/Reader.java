package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
	
	
	
	public void linereader(int a)  throws IOException{
		
		
		File f=new File("../Project1/intro.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		String s=null;
		for(int i=1;i<=a;i++) {
			  s=bf.readLine();
			
		}
		
		if(s!=null) {
			System.out.println(s);
		}
			else {
				
				System.out.println("No text on this line");
			
			
			}
		
		bf.close();
	}

	
	public static void main(String[] args) throws IOException  {
		
		
		Reader r=new Reader();
		System.out.println("Please enter line number");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		r.linereader(+b);
		
		sc.close();
		
		
		
	}
	
}
