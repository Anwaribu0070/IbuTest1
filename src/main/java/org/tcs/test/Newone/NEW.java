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

public class NEW {
	public static void main(String[] args) throws IOException {
		
	
	
	File f= new File("C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\excel\\Sheet1.xlsx");
	
	FileInputStream s= new FileInputStream(f);
	Workbook w= new XSSFWorkbook(s);

	Sheet s1 = w.getSheet("Sheet1");
	
	for(int i=0; i<s1.getPhysicalNumberOfRows();i++) {
		
		Row r = s1.getRow(i);
		
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j);
			
			System.out.println(c);
		}

	}
	
}
}
