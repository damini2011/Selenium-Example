package com.orangeHRM.baseclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils extends SeleniumBrowser{

	public static void click(By locator)
	{
		getDriverInstance().findElement(locator).click();
		
	}
	
	public static void sendKey(By locator,String key)
	{
		getDriverInstance().findElement(locator).sendKeys(key);
	}
//	public static void actionsClass(WebElement Elements)
//	{
//		Actions a11=new Actions(getDriverInstance());   
//		a11.moveToElement(Elements).build().perform(); 
//		
//	}
}
