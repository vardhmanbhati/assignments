package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxrow {
	
	public void xlxsrowread(int a) throws IOException {
		
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\input2.xlsx");
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(f1);
		XSSFSheet sk=wk.getSheetAt(0);
		int r=sk.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			
			XSSFRow r1=sk.getRow(i);
			if(i==a) {
			for(int j=0;j<r1.getPhysicalNumberOfCells();j++) {
				XSSFCell c1=r1.getCell(j);
				System.out.println(c1.getStringCellValue());
			}}
			
		}
	}

	public static void main(String[] args) throws IOException {
		xlsxrow obj=new xlsxrow();
		obj.xlxsrowread(0);
	}
}
