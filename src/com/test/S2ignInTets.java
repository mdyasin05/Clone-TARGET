package com.test;

import org.testng.annotations.Test;

import com.Configure.BaseClass;
import com.locator.S1ignInLocator;
import com.value.SignInValue;

public class S2ignInTets extends BaseClass{
	
	S1ignInLocator sloc=new S1ignInLocator();
	
	SignInValue sval=new SignInValue();
	
	
	
	
	@Test(groups={"priority1"})
		
	public void SignInTesting() throws InterruptedException{
		
		Bywait(60);
		
		clickbyxpath(sloc.MyAccountLocator);
		
		ClickbyLinktaxt(sloc.SignIn);
		
		String signinheader= gettaxtbycss(sloc.header);
	
		if(signinheader.equalsIgnoreCase("sign in"))
			
			System.out.println("we r already in signin page");
		else 
			System.err.println("wrong page");
		
		entervaluebyxpath(sloc.SignInEmail,sval.SignInEmailVal);
		Thread.sleep(60);
		
		entervaluebyxpath(sloc.SignInpassword,sval.SignInpasswordVal);
		Thread.sleep(100);
		
		clickbyxpath(sloc.clicksubmit);
		
		
		
		
		
		
		
		
		
	}

}
