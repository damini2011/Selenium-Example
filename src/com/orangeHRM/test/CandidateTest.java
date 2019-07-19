package com.orangeHRM.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHRM.wrapper.Recruitment.Candidates;
import com.orangeHRM.wrapper.login.Login;

public class CandidateTest extends BrowserTest{
	Candidates obj = new Candidates();
	private Login login = new Login();

	@BeforeClass(groups = { "all", "employee" })
	public void login() {
		login.LoginIntoApplication("Admin", "admin123");
	}

	@Test(groups = { "all", "employee" })
	public void testCandidateInfo() {
		obj.ClickOnRecruitment();
		obj.ClickOnCancidates();
		obj.ClickOnAddBtn();
		obj.enterUserDetails("ABC", "XYZ", "abc@gamail.com");
		obj.clickSave();

	}

	@AfterClass(groups = { "all", "employee" })
	public void logout() {
		login.LogoutFromApplication();
	}
}
