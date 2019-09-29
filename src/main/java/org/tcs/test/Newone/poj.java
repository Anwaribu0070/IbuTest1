package org.tcs.test.Newone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class poj extends Bas{
	
	public poj() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(id="pass")
	private WebElement pas;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPas() {
		return pas;
	}
	@FindBy(id="loginbutton")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}

}
