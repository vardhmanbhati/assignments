package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxcopy {
 String str;
	public void xlsxcopy1() throws IOException {
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\input2.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fi);
		XSSFSheet sk=wk.getSheetAt(0);
		int r=sk.getPhysicalNumberOfRows();
		
		File f1=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output3.xlsx");
		FileOutputStream fo=new FileOutputStream(f1);
		XSSFWorkbook wk1=new XSSFWorkbook();
		XSSFSheet sk1=wk1.createSheet("Sheet1");
		
		for(int i=0;i<r;i++) {
			XSSFRow xr=sk.getRow(i);
			XSSFRow xr1=sk1.createRow(i);
			for(int j=0;j<xr.getPhysicalNumberOfCells();j++) {
				XSSFCell c=xr.getCell(j);
				XSSFCell c1=xr1.createCell(j);
			 str=c.getStringCellValue();
				c1.setCellValue(str);
				
			}
		}
		
		wk1.write(fo);
		fo.flush();
		fo.close();
		
	}

	public static void main(String[] args) throws IOException {
		xlsxcopy obj=new xlsxcopy();
		obj.xlsxcopy1();
		
	}
}
