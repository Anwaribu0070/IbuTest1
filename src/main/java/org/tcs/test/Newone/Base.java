package org.tcs.test.Newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Base {
	
static WebDriver driver;
	public static WebDriver  getDriverAccess() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 return driver;
	}
	
	
	public static  void loadUrl(String url) {
	driver.get(url);
	}

	public static void selectByvalue(Select s,String value ) {
		s.selectByValue(value);
	}
	
	public static void fill(WebElement e, String s) {
		e.sendKeys(s);
		}
	public static  void buttonclick(WebElement element) {
		element.click();
		
	}
	
	public static void selectByIndex(WebElement s1, int index) {
		Select s= new Select(s1);
		s.selectByIndex(index);
		
	}
	
	
	public static void cell1(WebElement e1) {
		
		String s=e1.getAttribute("value");
		System.out.println(s);
		
		
	}}
	
	

		
		
		
	


