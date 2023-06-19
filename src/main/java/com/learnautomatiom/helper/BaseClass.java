package com.learnautomatiom.helper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomatiom.dataProvider.ConfigReader;
import com.learnautomatiom.factory.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		System.out.println("LOG:INFO - Running  Before Class - Setting up application");
		
		driver=BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO - Running  After Class - Terminating the session");
		driver.quit();
	}
	

}
