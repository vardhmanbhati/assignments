package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxwrite {
	
	public void xlsxwriter(int a,int b,String s) throws IOException {
		 
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output2.xlsx");
		FileOutputStream f1=new FileOutputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet sk=wk.createSheet("Sheet1");
		
		for(int i=0;i<=a;i++) {
			
			XSSFRow r=sk.createRow(i);
			for(int j=0;j<=b;j++) {
				 XSSFCell c1=r.createCell(j);
				 c1.setCellValue(s);
			}
		}
		wk.write(f1);
		f1.flush();
		f1.close();
	}
public static void main(String[] args) throws IOException {
	
	xlsxwrite obj=new xlsxwrite();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter data to print");
	obj.xlsxwriter(3, 3,sc.next());
}
}
