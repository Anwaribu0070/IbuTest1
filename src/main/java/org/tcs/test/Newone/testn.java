package org.tcs.test.Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testn {
	
	@Parameters({"username","password"})
	@Test(priority=-1)

	private void logic(String s1, String s2) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(s1);
		
		driver.findElement(By.id("pass")).sendKeys(s2);
		
		
	}
  
}
