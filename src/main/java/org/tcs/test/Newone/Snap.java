package org.tcs.test.Newone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\popz\\Newone\\drivers\\chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.snapdeal.com");
		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 WebElement search = driver.findElement(By.id("inputValEnter"));
		 search.sendKeys("iphonex");
		 
		 Robot c= new Robot();
		 
		 c.keyPress(KeyEvent.VK_ENTER);
		 c.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement phone = driver.findElement(By.xpath("//p[text()='Apple iPhone X Plain Cases REGLET - Transparent']"));
		 phone.click();
		 
		 
		 String parent = driver.getWindowHandle();
		 System.out.println(parent);
		 
		 
		 Set<String> all = driver.getWindowHandles();
		 System.out.println(all);
		 
		 for(String x:all) {
			 if(!parent.equals(x)) {
				 driver.switchTo().window(x);
			 }
		 }
		 
	     driver.findElement(By.xpath("//a[contains(text(),'T&C')]")).click();		 
		 
		 driver.switchTo().defaultContent();
		 
		 
		 Set<String> al1 = driver.getWindowHandles();
		 
		 List<String>li = new ArrayList<String>();
		 
		 
		 li.addAll(al1);
		 
		 String s = li.get(2);
		 
		 driver.switchTo().window(s);
		 
		 
		 driver.findElement(By.xpath("(//a[text()='Apply Now'])[1]")).click();
		 
		 
		 driver.switchTo().defaultContent();
		 
		 
		 
		}
	

}
