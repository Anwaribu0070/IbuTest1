package org.tcs.test.Newone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-table/");
			driver.manage().window().maximize();
			
	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement user = driver.findElement(By.id("email"));
			user.sendKeys("123456");
				}

}
 