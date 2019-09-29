package org.tcs.test.Newone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base1 extends Base {
	
	public Base1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement log;
	
   @FindBy(id="location")
   private WebElement loc;
   
   @FindBy(id="hotels")
   private WebElement hot;   	

   public WebElement getHot() {
	return hot;
}

@FindBy(id="room_type")
   private WebElement room;

   @FindBy(id="room_nos")
   private WebElement roomn;
   
   @FindBy(id="datepick_in")
   private WebElement date;
   
   
   @FindBy(id="datepick_out")
   private WebElement dateo;
   
   @FindBy(id="adult_room")
   private WebElement aroom;
   
   @FindBy(id="child_room")
   private WebElement croom;
   
   @FindBy(id="Submit")
   private WebElement sub;
   
     
   
	public WebElement getSub() {
	return sub;
}

	public WebElement getLog() {
		return log;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomn() {
		return roomn;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateo() {
		return dateo;
	}

	public WebElement getAroom() {
		return aroom;
	}

	public WebElement getCroom() {
		return croom;
	}
	
	
	
	
	

}
