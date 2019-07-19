package com.orangeHRM.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHRM.wrapper.Leave.LeaveList;
import com.orangeHRM.wrapper.PIM.AddEmployee;
import com.orangeHRM.wrapper.login.Login;

public class LeaveListTest extends BrowserTest {
	
	LeaveList LL=new LeaveList();
	private Login login =new Login();
	
	@BeforeClass(groups= {"all","employee"})
	public void login()
	{
		login.LoginIntoApplication("Admin", "admin123");
	}
	
	
	@Test(groups= {"all","employee"}) 
	public void testLeavelist() throws InterruptedException
	{
		LL.LeaveList1();
	}
	
	
	
	@AfterClass (groups= {"all","employee"})
	public void logout()
	{
		login.LogoutFromApplication();
	}

}
