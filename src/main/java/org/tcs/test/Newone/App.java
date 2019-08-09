package org.tcs.test.Newone;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	static WebDriver driver;
	@BeforeClass
	
	public  static void launch() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");

		

	}
	@Test 	
	public  void logic() {
	
		WebElement f = driver.findElement(By.id("email"));
		f.sendKeys("anwaribu0070@gmail.com");
		
		WebElement ff = driver.findElement(By.id("pass"));
		ff.sendKeys("1234567");
		
		
	}
        
    }

