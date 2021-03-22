package pkg1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RangeWriter {
	
	public void xlwriterrange(String str,int j,int k) throws IOException {
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output.txt");
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter bw=new BufferedWriter(fw);
	for (int i=1;i<j;i++) {
		bw.newLine();
		
		for(int a=1;a<=(k-j+1);a++) {
			
			bw.write(str);
			bw.newLine();
		}
	}
	bw.close();
}

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your data");
		String str=sc.nextLine();
		System.out.println("Please enter range");
		sc.useDelimiter("\\D");
		int j=sc.nextInt();
		int k=sc.nextInt();
		RangeWriter w=new RangeWriter();
		w.xlwriterrange(str,j,k);
		
	sc.close();
		
	}
	
}

