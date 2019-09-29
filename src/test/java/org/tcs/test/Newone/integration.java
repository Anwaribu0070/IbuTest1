package org.tcs.test.Newone;

public class integration extends Baseclass {

	
	public static void main(String[] args) throws Throwable {
		
		
		getdriveraccess();
		
		loadurl("https://www.facebook.com/");
		
		pojo p = new pojo();
		
		fill(p.getMail(),getDate(0, 0));
		
		fill(p.getPass(),getDate(2,1));

		
		
		
	}
	
	

}
