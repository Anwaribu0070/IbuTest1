package org.tcs.test.Newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bas {
	
	static WebDriver driver;
public static WebDriver  getDriverAccess() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 return driver;
	}

 public static  void loadurl(String url) {
	 driver.get(url);
	}
 
 public static  void fill( WebElement element, String value) {
	 element.sendKeys(value);
	}
 
 public static  void button(WebElement element) {
	element.click();

}

}
