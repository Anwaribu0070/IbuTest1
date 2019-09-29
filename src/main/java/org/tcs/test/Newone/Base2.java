package org.tcs.test.Newone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base2 extends Base{
	public Base2(){
		
		PageFactory.initElements(driver, this);
			}

	
	@FindBy(id="radiobutton_0")

	private WebElement but;
	
	
	@FindBy(id="continue")
	private WebElement cont;


	public WebElement getBut() {
		return but;
	}


	public WebElement getCont() {
		return cont;
	}
	
	
	
}
