package com.Configure;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utility.UtilityClass;

public class BaseClass extends UtilityClass {
	
	
	@BeforeTest
	public void beforetest(){
		
		openChromeDriver("http://www.target.com/");
		maxpage();
		Bywait(100);
		
		
		
	}
	
	@AfterTest
	public void aftertest(){
		
		closebrowser();
		
	}
		
	}


