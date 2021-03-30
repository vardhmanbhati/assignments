package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWriter {

	public void xlswriter(int a,int b,String s) throws IOException, RowsExceededException, WriteException {
		File f=new File("C:\\\\Users\\\\vardhman.singh.bhati\\\\Desktop\\\\output.xls");
		WritableWorkbook w= Workbook.createWorkbook(f);
		WritableSheet s1=w.createSheet("Sheet1", 0);
		
		Label l=new Label(a,b,s);
		s1.addCell(l);
		
		w.write();
		w.close();
	}
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		ExcelWriter ew=new ExcelWriter();
		
		System.out.println("Please enter the data to add in cell");
		Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		ew.xlswriter(0,0,s);
		sc.close();
		
	}
	
}
