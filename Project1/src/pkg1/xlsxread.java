package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxread {

	public void xlsx(int a,int c) throws IOException {
		
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\input2.xlsx");
		FileInputStream f1=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(f1);
		XSSFSheet sk=wk.getSheetAt(0);
		int r=sk.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			
			XSSFRow xr=sk.getRow(i);
			
			for(int j=0;j<xr.getPhysicalNumberOfCells();j++) {
				
				XSSFCell cell=xr.getCell(j);
				if(i==a && j==c) {
				System.out.println(cell.getStringCellValue());
			}}}}
	
	public static void main(String[] args) throws IOException {
		
		xlsxread obj=new xlsxread();
		obj.xlsx(0,2);
		}}
