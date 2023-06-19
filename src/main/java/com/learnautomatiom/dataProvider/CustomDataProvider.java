package com.learnautomatiom.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	// use this data provider in order to access login credentails
	@DataProvider(name="users")
	public static Object[][] getLoginData()
	{
		Object [][]arr=ExcelReader.getDataFromSheet("Users");
		return arr;
	}
	
	
}
