package com.orangeHRM.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHRM.wrapper.PIM.AddEmployee;
import com.orangeHRM.wrapper.PIM.EmployeeList;
import com.orangeHRM.wrapper.login.Login;

//import learn.testng.demo.Object;

public class EmployeeListTest extends BrowserTest{
	
	EmployeeList empList=new EmployeeList(); 
	private Login login =new Login();
	
	@BeforeClass(groups= {"all","employee"})
	public void login()
	{
		login.LoginIntoApplication("Admin", "admin123");
	}
	
	
	@Test(groups= {"all","employee"})
	public void testEmployeeList() throws InterruptedException
	{
		empList.clickOnPim(); 
		empList.clickOnEmpList();
		empList.enterEmpName("Monica");
		empList.enterEmpId("0060");
		empList.EmpStatus();
		empList.Include();
		empList.clickOnSearch();
	}
	
	
	@AfterClass (groups= {"all","employee"})
	public void logout()
	{
		login.LogoutFromApplication();
	}

}
