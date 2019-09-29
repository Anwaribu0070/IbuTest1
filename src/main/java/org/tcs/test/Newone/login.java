package org.tcs.test.Newone;

import org.openqa.selenium.support.ui.Select;

public class login extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		getDriverAccess();
		loadUrl("https://adactin.com/HotelApp/index.php");
		Base1 b = new Base1();
		
	fill(b.getUser(),"Anwar0070");
	fill(b.getPass(),"Anwar@0070");
	buttonclick(b.getLog());
	
	
	fill(b.getLoc(),"Sydney");
	
	fill(b.getHot(),"Hotel Creek");
	
	fill(b.getRoom(),"Double");
	
	fill(b.getRoomn(),"2-Two");
	
	fill(b.getDate(),"10/08/2019");
	
	fill(b.getDateo(),"11/08/2019");
	
	fill(b.getAroom(),"2-Two");
	
	fill(b.getCroom(),"1-One");
	
	buttonclick(b.getSub());
	
	
	Base2 b2=new Base2();
	buttonclick(b2.getBut());
	
	buttonclick(b2.getCont());
	
	Base3 b3= new Base3();
	
	fill(b3.getFir(),"Anwar");
	
	fill(b3.getLast(),"ibu");
	
	fill(b3.getAdd(),"chennai");
	
	fill(b3.getCc(),"1234567890098765");
	
	fill(b3.getCct(),"master card");
	
	selectByIndex(b3.getCcm(),6);
	
	selectByIndex(b3.getExpy(),7);
	
	fill(b3.getCvv(),"432");
	
	buttonclick(b3.getBook());
	Thread.sleep(10000);
	cell1(b3.getOno());
	
	}

}
