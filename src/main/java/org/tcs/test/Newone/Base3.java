package org.tcs.test.Newone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base3 extends Base {
	public Base3() {
		PageFactory.initElements(driver, this);
	}	
	

	@FindBy(id="first_name")
	private WebElement fir;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement cct;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccm;
	
	@FindBy(id="cc_exp_year")
	private WebElement expy;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	

	@FindBy(id="book_now")
	private WebElement book;
	

	@FindBy(id="order_no")
	private WebElement ono;


	public WebElement getFir() {
		return fir;
	}


	public WebElement getLast() {
		return last;
	}


	public WebElement getAdd() {
		return add;
	}


	public WebElement getCc() {
		return cc;
	}


	public WebElement getCct() {
		return cct;
	}


	public WebElement getCcm() {
		return ccm;
	}


	public WebElement getExpy() {
		return expy;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public WebElement getBook() {
		return book;
	}


	public WebElement getOno() {
		return ono;
	}
	
}
