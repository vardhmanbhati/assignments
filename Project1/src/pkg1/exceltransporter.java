package pkg1;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class exceltransporter {
	
	public void copyxls() throws BiffException, IOException, WriteException {
		
		File f=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\input1.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int r=s.getRows();
		int c=s.getColumns();
		File f1=new File("C:\\Users\\vardhman.singh.bhati\\Desktop\\output1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f1);
		WritableSheet sh=wk.createSheet("output", 0);
		
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
				Cell C1=s.getCell(i,j);
				String data=C1.getContents();
					Label l=new Label(i, j, data);
					sh.addCell(l);
				
					}
				}
				
				wk.write();
				wk.close();
			}
			
			
		public static void main(String[] args) throws BiffException, IOException, WriteException {
		
		exceltransporter et=new exceltransporter();
		et.copyxls();
		
		
		
		
	}

}
