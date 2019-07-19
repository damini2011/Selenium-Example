package com.orangeHRM.test;

import org.testng.annotations.Test;


import com.orangeHRM.wrapper.login.Login;

public class LoginTest extends BrowserTest {

	
	Login login=new Login();
	
	@Test(priority=1,groups= {"all","login"})
	public void testLogin()
	{
		login.LoginIntoApplication("Admin", "admin123");
	}
	
	
	@Test(priority=2,groups= {"all","login"})
	public void testLogout()
	{
		login.LogoutFromApplication();
	} 
}
