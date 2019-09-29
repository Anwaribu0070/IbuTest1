package org.tcs.test.Newone;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	
	public static  void launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
	    
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
			}

	
	@Test
	
	public static  void logic() {
		
		
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
		WebElement one = driver.findElement(By.id("email"));
		one.sendKeys("1234567890");
	}
}
