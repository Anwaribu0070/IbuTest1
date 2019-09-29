package org.tcs.test.Newone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		
	
	
	File f= new File("C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\excel\\Book4.xlsx");
	
	FileInputStream stream= new FileInputStream(f);
	Workbook w= new XSSFWorkbook(stream);

	Sheet s = w.getSheet("Sheet1");
	
	Row r = s.getRow(0);
	
	
	Cell c = r.getCell(1);
	System.out.println(c);
	
	//to find the cell type 
	
//	int ct = c.getCellType();
//	System.out.println(ct);
	
	/// using for loop 
	
for(int i =0; i<s.getPhysicalNumberOfRows(); i++) {
		Row rr = s.getRow(i);
		
		for(int j=0; j<rr.getPhysicalNumberOfCells();j++) {
			Cell cc = rr.getCell(j);
			int type = c.getCellType();
			System.out.println(type);
			
			if(type==1) {
				String stringCellValue = c.getStringCellValue();
				System.out.println(stringCellValue);
			}
				else if(type==0) {
					
					if(DateUtil.isCellDateFormatted(c));
					Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat();
				
				//converting date into string 
				
				String format = sim.format(dateCellValue);
				
				System.out.println(format);
				
				}
				else {
					
					double numericCellValue = c.getNumericCellValue();
					
					//typecast
					
					long l=(long)numericCellValue;
					
					//converting string 
					
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
					
			  }
			}		
		 }		
	  }
	}
	
	



	
