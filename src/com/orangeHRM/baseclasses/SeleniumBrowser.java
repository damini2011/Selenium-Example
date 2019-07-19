package com.orangeHRM.baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.orangeHRM.test.BrowserTest;

public class SeleniumBrowser {

	public static  WebDriver driver=null;
	

	
	public void openUrl()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Opening URL");

	}
	
	public void chromeBrowser()
	{
//		if(driver == null)
//		{
			setDriverInstance(); 
//		}
	}
	
	private  void setDriverInstance()
	{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static  WebDriver getDriverInstance()
	{
//		if(driver == null) 
//		{
//			setDriverInstance();
//		}
		return driver;
	}
}
