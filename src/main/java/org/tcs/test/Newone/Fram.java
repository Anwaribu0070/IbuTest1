package org.tcs.test.Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphonex");
	
	WebElement findElement2 = driver.findElement(By.className("nav-input"));
	findElement2.click();
		
	
		
		
	}

}
