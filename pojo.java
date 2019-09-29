package org.tcs.test.Newone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends Baseclass {

	public pojo() {
			
		PageFactory.initElements(driver, this);
}

	
	@FindBy(id="email")
	private WebElement mail;
	
	
	

	@FindBy(id="pass")
	private WebElement pass;




	public WebElement getMail() {
		return mail;
	}




	public WebElement getPass() {
		return pass;
	}
	
	
	
}
