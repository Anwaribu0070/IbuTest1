package org.tcs.test.Newone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		
	
	
	File f= new File("C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\excel\\Sheet1.xlsx");
	
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
			
	
			
			
			
		}
		
		
		
		
		
	}
	
	}
	
	

}

	
