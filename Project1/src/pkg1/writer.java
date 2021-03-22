package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writer {

	public void xlwriter(String str,int j) throws IOException {
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output.txt");
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter bw=new BufferedWriter(fw);
	for (int i=1;i<=j;i++) {
		bw.write(str);
		bw.newLine();
	}
	bw.close();
}

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your data");
		String str=sc.nextLine();
		System.out.println("how many lines");
		int j=sc.nextInt();
		writer w=new writer();
		w.xlwriter(str,+j);
		
	sc.close();
		
	}
	
}
