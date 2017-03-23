package com.test;

import org.testng.annotations.Test;

import com.Configure.BaseClass;
import com.locator.CategoriesLocator;
import com.value.CategoriesValue;

public class CategoriesTesting  extends BaseClass{
	
	CategoriesLocator pp=new CategoriesLocator();
	CategoriesValue   mm= new CategoriesValue();
	
	
	//@Test
	public void SelectCategories() throws InterruptedException{
		
		Bywait(60);
		
//		clickbyxpath(pp.CateLoc);
//		
//		Thread.sleep(50);
//		
//		ClickbyLinktaxt(pp.shows);
//		
//		clickbyxpath(pp.menShows);
//		
//		clickbyxpath(pp.snecker);
//		
//		clickbyxpath(pp.ClickOn);
		
		clickbyxpath(pp.giftcard);
		
		//clickbyxpath(pp.cardTheater);
		Thread.sleep(30);
		
		clickbyxpath(pp.cardbalance);
		
		entervaluebyxpath(pp.cardnumber,mm.cardnumvalue);
		
		entervaluebyxpath(pp.pinnumber,mm.pinnumvalue);
		
	    clickbyxpath(pp.checkbalance);
		
		//Thread.sleep(60);
		clickbyxpath(pp.check);
		
	}
	
	
		
		@Test
		public void help() throws InterruptedException   {
			
		
			
			Thread.sleep(30);
			clickbyxpath(pp.help);	
			
			clickbyxpath(pp.contractus);
			
			dropdown(pp.dropdown,mm.indexvalue);
			
			
		}
		
		
		
		
	}
	
	


