package com.learnautomatiom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomatiom.helper.BaseClass;

public class SmokeTest extends BaseClass
{

	@Test
	public void verifyURL()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"URL does not contain login");
		
	}
	
	

}
