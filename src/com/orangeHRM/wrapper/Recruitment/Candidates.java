package com.orangeHRM.wrapper.Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;

public class Candidates extends SeleniumBrowser {
	
	public void ClickOnRecruitment() {
		WebElement Elementa = getDriverInstance().findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		Actions b1 = new Actions(getDriverInstance());
		b1.moveToElement(Elementa).build().perform();
		SeleniumUtils.click(By.id("menu_recruitment_viewRecruitmentModule"));
		//getDriverInstance().findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	}
	
	public void ClickOnCancidates() {
		WebElement Elements = getDriverInstance().findElement(By.id("menu_recruitment_viewCandidates"));
		//SeleniumUtils.actionsClass(Elements);
		Actions b2 = new Actions(getDriverInstance());
		b2.moveToElement(Elements).build().perform();
		SeleniumUtils.click(By.id("menu_recruitment_viewCandidates"));
		//getDriverInstance().findElement(By.id("menu_recruitment_viewCandidates")).click();
	}
	
	public void ClickOnAddBtn() {
		SeleniumUtils.click(By.id("btnAdd"));
		//getDriverInstance().findElement(By.id("btnAdd")).click();
	}
	
	public void enterUserDetails(String firstName,String lastName,String email)
	{
		SeleniumUtils.sendKey(By.id("addCandidate_firstName"), firstName);
		SeleniumUtils.sendKey(By.id("addCandidate_lastName"), lastName);
		SeleniumUtils.sendKey(By.id("addCandidate_email"), email);
		//getDriverInstance().findElement(By.id("addCandidate_firstName")).sendKeys(firstName);
		//getDriverInstance().findElement(By.id("addCandidate_lastName")).sendKeys(lastName);
		//getDriverInstance().findElement(By.id("addCandidate_email")).sendKeys(email);
		
	}
	
	public void clickSave()
	{
		SeleniumUtils.click(By.id("btnSave"));
		//getDriverInstance().findElement(By.id("btnSave")).click();
	}
	
}
