package com.Test2;

import org.testng.annotations.Test;

import com.Configure.BaseClass;
import com.locator.MoreLocator;
import com.value.MoreValue;

public class MoreTest1 extends BaseClass{
	
	MoreLocator nn=new MoreLocator();
	
	MoreValue   bb=new MoreValue();
	
	
	@Test
	public void moretest() throws InterruptedException{
		
		clickbyxpath(nn.morexpath);
		
		clickbyxpath(nn.adbertise);
		
		clickbyxpath(nn.contractUs);
		
		String header=gettaxtbycss(nn.contractusHeader);
		
		if(header.equalsIgnoreCase("connect with us"))
			
			System.out.println("the link name is right");
		
		else 
			
			System.out.println("wrong");
		
		
		entervaluebyxpath(nn.firstname,bb.firstnameValue);
		
		entervaluebyxpath(nn.lastname,bb.lastnameValue);
		
		entervaluebyxpath(nn.organisation,bb.organisation);
		
		dropdown6(nn.industry,3);   
		
		Thread.sleep(200);
	
		entervaluebyxpath(nn.email,bb.emailValue);
		
		entervaluebyxpath(nn.phoneNumber,bb.phoneValue);
		
		clickbyxpath(nn.button);
		
		entervaluebyxpath(nn.messege,bb.messegeValuue);
		
		clickbyxpath(nn.submit);
		
		
		
		
		
	}
	
	

}
