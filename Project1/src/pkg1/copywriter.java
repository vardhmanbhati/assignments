package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copywriter {

	public void copycat() throws IOException {
		
	File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\intro.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		File f1=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output.txt");
	    FileWriter fw=new FileWriter(f1);
	    BufferedWriter bw=new BufferedWriter(fw);
		
	String s=null;
	while((s=br.readLine()) != null) {
		
		bw.write(s);
		bw.newLine();
		
		
	}
		bw.close();
		br.close();
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		 copywriter cp= new copywriter();
		 cp.copycat();
		
	
	}
}
