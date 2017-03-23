package com.value;

import org.testng.annotations.Test;

public class DataProvider {
	
	
	@Test(dataProvider="getData")
	public void dprovider(String name,String password,String number){
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(number);
	}
	
	
	@org.testng.annotations.DataProvider
	
	public Object[][] getData(){
		
		Object[][] data=new Object[3][3];
		
		data[0][0]="rony";
		data[0][1]="123";
		data[0][2]="01";
		data[1][0]="ali";
		data[1][1]="234";
		data[1][2]="012";
		data[2][0]="momin";
		data[2][1]="345";
		data[2][2]="03";
		
		return data;
		
	}
	
	
	

}
