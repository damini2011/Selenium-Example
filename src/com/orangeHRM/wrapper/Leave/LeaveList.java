package com.orangeHRM.wrapper.Leave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;
import com.orangeHRM.wrapper.login.Login;

public class LeaveList extends SeleniumBrowser {
	
	public void LeaveList1() throws InterruptedException {
		
		WebElement Elements=getDriverInstance().findElement(By.id("menu_leave_viewLeaveModule"));
		//SeleniumUtils.actionsClass(Elements);
		Actions a11=new Actions(getDriverInstance());  
		a11.moveToElement(Elements).build().perform();
		
		Thread.sleep(2000);
		SeleniumUtils.click(By.id("menu_leave_viewLeaveModule"));
		//getDriverInstance().findElement(By.id("menu_leave_viewLeaveModule")).click(); 
		Reporter.log("Clicked on Leave",true);
		
		
		WebElement Element1=getDriverInstance().findElement(By.id("menu_leave_viewLeaveList"));
		//SeleniumUtils.actionsClass(Element1);
		Actions a3=new Actions(getDriverInstance());
    	a3.moveToElement(Elements).click(); 
		Reporter.log("Clicked on Leave List",true);
	} 

}
