package com.orangeHRM.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.orangeHRM.baseclasses.SeleniumBrowser;

public class BrowserTest extends SeleniumBrowser{
	
	@BeforeSuite(groups= {"all","employee","login"})
	public void openbrowser() throws InterruptedException {

	
		chromeBrowser();
		openUrl();
	}
	
//	@AfterSuite
//	public void openbrowser() throws InterruptedException {
//
//		chromeBrowser();
//		openUrl();
//	}

}
