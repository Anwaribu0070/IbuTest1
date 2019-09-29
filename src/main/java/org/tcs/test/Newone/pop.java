package org.tcs.test.Newone;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class pop 
{

	@Test
	public   void launch() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();
	}
	
	@Test 	
	public  void logic1() {
	WebDriver driver = new ChromeDriver();
		Assert.assertTrue(driver.getTitle().contains("Instagram"));
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Mobile Number or Email']"));
		findElement.sendKeys("anwaribu");
		
       }
	
	@Test 	
	public  void logic2() {
        WebDriver driver= new ChromeDriver();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.instagram.com/"));
		WebElement findElement1 = driver.findElement(By.xpath("//span[text()='Full Name']"));
		findElement1.sendKeys("popz"); 

           }

}