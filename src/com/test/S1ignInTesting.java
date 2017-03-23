package com.test;

import org.testng.annotations.Test;

import com.Configure.BaseClass;
import com.locator.A2ccountCreateLoactor;
import com.value.AccountCreateValue;


public class S1ignInTesting extends BaseClass{
	
	A2ccountCreateLoactor sl=new A2ccountCreateLoactor();
	AccountCreateValue tl=new AccountCreateValue();
	
	@Test(groups={"priority1"})
	public void verifyCreateAcc() throws InterruptedException{
		
		Titlesite();
		Bywait(60);
		
		
		Thread.sleep(300);
		clickbyxpath(sl.MyAccount);
		
		ClickbyLinktaxt(sl.createaccount);  
		
		entervaluebyxpath(sl.emaillocator,tl.emailvalue);
		
		CHeckByID(sl.firstname,tl.firstname);
		
		CHeckByID(sl.lastname,tl.lastname);
		
		entervaluebyxpath(sl.password,tl.password);
		
		clickbyxpath(sl.submit);
		
		
		
		
	
		
		
	}

}
