package org.tcs.test.Newone;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class App 
{
	static WebDriver driver;
	@BeforeClass
	
	public  static void launch() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

	}
	@Test 	
	public  void logica() {
		
		SoftAssert s=new SoftAssert();
		
	
		s.assertTrue(driver.getTitle().contains("jj"));
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("1234567890");
		s.assertTrue(driver.getCurrentUrl().contains("htt"));
		WebElement findElement1 = driver.findElement(By.id("pass"));
		findElement1.sendKeys("1234567890");

		
        
        
	
	}
	
	@Test 	
	public  void logicb() {
	
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		WebElement findElement1 = driver.findElement(By.id("loginbutton"));
		findElement1.click();
           }

}