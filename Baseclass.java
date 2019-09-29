package org.tcs.test.Newone;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public static WebDriver getdriveraccess() {
		
		 driver= new ChromeDriver();
		
		return driver;
		}
	
	public static  void loadurl( String url) {
		driver.get(url);
		}
	
	
	public static  void fill(WebElement element, String value ) {

		element.sendKeys(value);
	}
	
	public static  void buttonclick(WebElement element ) {
		element.click();
		}
	
	
public static String getDate (int row,int cell) throws Throwable {
		
		String value=null;
		
		
		File loc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\excel\\excel new.xlsx");
		
		FileInputStream stream = new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(stream);
		
        Sheet s = w.getSheet("Anwar");
        
        Row r = s.getRow(row);
        
        Cell c= r.getCell(cell);
        
        
        System.out.println(c);
        
        
        
        
        int type = c.getCellType();
        if(type==1) {
        	
        	value=c.getStringCellValue();
        	
        }
        
        else if(type==0) {
        	
        	if (DateUtil.isCellDateFormatted(c));
        	
        	Date dateCellValue = c.getDateCellValue();
        	
        	SimpleDateFormat sim = new SimpleDateFormat("DD-MM-YY");
        	
        	value=sim.format(dateCellValue);
        	
        }
        
        else {
        	
        	double d = c.getNumericCellValue();
        	
        	long l =(long)d;
        	
        	value=String.valueOf(l);
        	
        }
		return value;
  }
}




