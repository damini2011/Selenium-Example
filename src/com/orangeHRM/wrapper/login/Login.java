package com.orangeHRM.wrapper.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;

public class Login extends SeleniumBrowser{

	 @FindBy(how = How.ID, using = "txtUsername")
	 static WebElement txt_username ;

	 @FindBy(how = How.ID, using = "txtPassword")
	 static WebElement txt_pwd ;
 
	 @FindBy(how = How.ID, using = "btnLogin")
	 static WebElement txt_login ;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Logout")
	 static WebElement txt_logout ;
	 
	 
	static
	 {
		 PageFactory.initElements(driver, Login.class);
	 }
	/**
	 * 
	 * @author
	 * @description this method will login into the application by taking username and password
	 */
	  
	 
	//Method to login into OrangeHrm 
	public void LoginIntoApplication(String username,String password) {
		
		// enter text in username text box.
		txt_username.sendKeys(username);
		txt_pwd.sendKeys(password); 
		txt_login.click();
		
//		getDriverInstance().findElement(By.id("txtUsername")).sendKeys(username);
//		getDriverInstance().findElement(By.id("txtPassword")).sendKeys(password); 
//		getDriverInstance().findElement(By.id("btnLogin")).click();
		Reporter.log("Logged in successfully",true);
//		WebDriverWait wait=new WebDriverWait(getDriverInstance(), 20);
//	 	WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
	}
 
	//Method to logout from OrangeHrm 
	public void LogoutFromApplication() {
		
		SeleniumUtils.click(By.id("welcome"));
		//getDriverInstance().findElement(By.id("welcome")).click();
		
		//waiting 20 sec for logout button to present on screen
		WebDriverWait wait = new WebDriverWait(getDriverInstance(), 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		txt_logout.click();
		//getDriverInstance().findElement(By.linkText("Logout")).click();
		
		Reporter.log("Logged out successfully",true); 
	}  

}
