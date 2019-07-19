package com.orangeHRM.wrapper.Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;

public class Vacancies extends SeleniumBrowser {
	
	public void ClickOnRecruitment() {
		WebElement Elements = getDriverInstance().findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		//SeleniumUtils.actionsClass(Elements);
		Actions a9 = new Actions(getDriverInstance());
		a9.moveToElement(Elements).build().perform();
		SeleniumUtils.click(By.id("menu_recruitment_viewRecruitmentModule"));
		//getDriverInstance().findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	}
	
	public void CliclOnVacancies() {
		WebElement Element11 = getDriverInstance().findElement(By.id("menu_recruitment_viewJobVacancy"));
		Actions b = new Actions(getDriverInstance());
		b.moveToElement(Element11).build().perform();
		SeleniumUtils.click(By.id("menu_recruitment_viewJobVacancy"));
		//getDriverInstance().findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	}
	
	public void ClickOnAddBtn() {
		SeleniumUtils.click(By.id("btnAdd"));
		//getDriverInstance().findElement(By.id("btnAdd")).click();
	}
	
	public void JobTitle(String JobTitle) {
		Select Title=new Select(getDriverInstance().findElement(By.id("addJobVacancy_jobTitle")));
		Title.selectByVisibleText(JobTitle); 
	}
	
	public void VacancyName(String VacName) {
		SeleniumUtils.sendKey(By.id("addJobVacancy_name"), VacName);
		//getDriverInstance().findElement(By.id("addJobVacancy_name")).sendKeys(VacName);
	}
	  
	public void HiringManager(String HiringMan) {
		SeleniumUtils.sendKey(By.id("addJobVacancy_hiringManager"), HiringMan);
		//getDriverInstance().findElement(By.id("addJobVacancy_hiringManager")).sendKeys(HiringMan);
	}
	
	public void ClickOnSave() {
		SeleniumUtils.click(By.id("btnSave"));
		//getDriverInstance().findElement(By.id("btnSave")).click();
	}


}
