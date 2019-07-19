package com.orangeHRM.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHRM.wrapper.PIM.AddEmployee;
import com.orangeHRM.wrapper.Recruitment.Vacancies;
import com.orangeHRM.wrapper.login.Login;

public class VacancyTest extends BrowserTest {
	
	Vacancies vac=new Vacancies();
	private Login login =new Login();
	
	@BeforeClass(groups= {"all","employee"})
	public void login()
	{
		login.LoginIntoApplication("Admin", "admin123");
	}
	
	
	@Test(groups= {"all","employee"})
	public void testAddEmployee() throws InterruptedException
	{
		vac.ClickOnRecruitment();
		vac.CliclOnVacancies();
		vac.ClickOnAddBtn();
		vac.JobTitle("HR Manager"); 
		vac.VacancyName("Sales Executive");
		vac.HiringManager("Fiona Grace");
		vac.ClickOnSave();
		 
	}
	
	@AfterClass (groups= {"all","employee"})
	public void logout()
	{
		login.LogoutFromApplication();
	}
	

}


