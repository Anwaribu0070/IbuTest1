package org.tcs.test.Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		
		String s=null;
		
		try{ int l = s.length();
       
		System.out.println(l);}
		
		catch  (Throwable e) {
			e.printStackTrace();
			System.out.println("null is empty");
		}
		
		finally { System.out.println("i am finally");
		
		System.out.println("finally is block it will execute the code of the finally block and its doesnt consider wheather the exception is handled or not ");
		
		
		
		}
		
		
	
		

	}

}
