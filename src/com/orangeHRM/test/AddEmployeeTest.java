package com.orangeHRM.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHRM.wrapper.PIM.AddEmployee;
import com.orangeHRM.wrapper.login.Login;

//import learn.testng.demo.Object;

public class AddEmployeeTest  extends BrowserTest {
	
	AddEmployee emp=new AddEmployee();
	private Login login =new Login();
	
	@DataProvider(name="employdata")
	public Object[][] employeeData()
	{
		Object[][] employeeTestData={ 
										{"Monika","Gayle","0052","Sadamin16","Sadamin@124","Sadamin@124","0011","Female"}
//										{"Monik","Gaylee","0051","Sadamini15","Sadamini@124","Sadamini@124","0011","Male"}
									};
		
		return employeeTestData;
	}
	
	@BeforeClass(groups= {"all","employee"})
	public void login()
	{
		login.LoginIntoApplication("Admin", "admin123");
	}
	
	
	@Test(groups= {"all","employee"},dataProvider="employdata")
	public void testAddEmployee(String firstName,String lname, String id, String uname,String password,String cpassword, String id1,String gnder ) throws InterruptedException
	{
		emp.clickOnPIM();
		emp.enterFullName(firstName, lname);
		emp.clickOnAddEmployee();
		emp.enterId(id);
		emp.clickOnCheckBox();
		emp.enterUserDetails(uname,password,cpassword);
		emp.enterMoreDetail(id1,gnder);
		
	}
	
//	@Test(groups= {"all","employee"},dataProvider="employdata")
//	public void testAddEmployee() throws InterruptedException
//	{
//		emp.clickOnPIM();
//		emp.enterFullName("Monik", "Gaylee");
//		emp.clickOnAddEmployee();
//		emp.enterId("0051");
//		emp.clickOnCheckBox();
//		emp.enterUserDetails("Sadamini1", "Sadamini@124", "Sadamini@124");
//		emp.enterMoreDetail("0011", "Female");
//		
//	}
		
	@AfterClass (groups= {"all","employee"})
	public void logout()
	{
		login.LogoutFromApplication();
	}
	

}
