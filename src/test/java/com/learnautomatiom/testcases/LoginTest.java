package com.learnautomatiom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomatiom.dataProvider.CustomDataProvider;
import com.learnautomatiom.helper.BaseClass;
import com.learnautomation.constants.Constants;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseClass
{

	@Test(dataProvider = "users",dataProviderClass = CustomDataProvider.class)
	public void loginToApp(String username,String password)
	{
		LoginPage page=new LoginPage(driver);
		
		page.loginToApplication(username, password);
	
		boolean status=page.captureErrorMessage().contains(Constants.userDoesNotExist);
		
		Assert.assertTrue(status,"Error messages is displayed as expected");
		
	}
	
	

}
