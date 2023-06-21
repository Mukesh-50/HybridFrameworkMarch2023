package com.learnautomatiom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomatiom.helper.BaseClass;

public class SmokeTest extends BaseClass
{

	@Test
	public void verifyURL()
	{
		System.out.println("Test Suite Started");
		System.out.println("Test Case Started");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"URL does not contain login");
		System.out.println("Test Suite Completed");
		System.out.println("Test Ended");
	}
	
	

}
