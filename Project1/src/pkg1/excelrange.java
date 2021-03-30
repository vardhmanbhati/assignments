package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelrange {

public void xlsrangereader(int a,int b) throws BiffException, IOException {
		
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\input1.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int r=s.getRows();
		int c=s.getColumns();
		
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
		        Cell C1=s.getCell(j,i);
		        
		        if(a<= i && i<=b)
		        System.out.print(" " +C1.getContents());}
		}}
//		System.out.println();	
//		}}
	
	public static void main(String[] args) throws BiffException, IOException {
		
		excelrange ER=new excelrange();
		ER.xlsrangereader(1,3);
		
	}
	
}
