package com.orangeHRM.wrapper.PIM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;
import com.orangeHRM.test.BrowserTest;

public class AddEmployee extends SeleniumBrowser {

	public void clickOnPIM() {
		WebElement Element1 = getDriverInstance().findElement(By.id("menu_pim_viewPimModule"));
		//SeleniumUtils.actionsClass(Element1);
		Actions a1 = new Actions(getDriverInstance());
		a1.moveToElement(Element1).build().perform();

		SeleniumUtils.click(By.id("menu_pim_addEmployee"));

		// getDriverInstance().findElement(By.id("menu_pim_addEmployee")).click();
	}

	public void clickOnAddEmployee() {
		WebElement Element2 = getDriverInstance().findElement(By.id("menu_pim_addEmployee"));
		Actions a2 = new Actions(getDriverInstance());
		a2.moveToElement(Element2).click();
	}

	public void enterFullName(String firstname, String lastname) {

		SeleniumUtils.sendKey(By.id("firstName"), firstname);
		// getDriverInstance().findElement(By.id("firstName")).sendKeys(firstname);

		SeleniumUtils.sendKey(By.id("lastName"), lastname);  
		//getDriverInstance().findElement(By.id("lastName")).sendKeys(lastname);

	}

	public void enterId(String id) {
		SeleniumUtils.sendKey(By.id("employeeId"), id);
		// getDriverInstance().findElement(By.id("employeeId")).sendKeys(id);
	}

	public void clickOnCheckBox() {
		SeleniumUtils.click(By.id("chkLogin"));
		// getDriverInstance().findElement(By.id("chkLogin")).click();
	}

	public void enterUserDetails(String username, String userpwd, String cnfmpwd) throws InterruptedException {
		SeleniumUtils.sendKey(By.id("user_name"), username);
		SeleniumUtils.sendKey(By.id("user_password"), userpwd);
		SeleniumUtils.sendKey(By.id("re_password"), cnfmpwd);
		// getDriverInstance().findElement(By.id("user_name")).sendKeys(username);

		// getDriverInstance().findElement(By.id("user_password")).sendKeys(userpwd);
		// getDriverInstance().findElement(By.id("re_password")).sendKeys(cnfmpwd);

		Select dropdown = new Select(getDriverInstance().findElement(By.id("status")));
		dropdown.selectByVisibleText("Enabled");
		SeleniumUtils.click(By.id("btnSave"));
		Thread.sleep(5000);
//		SeleniumUtils.click(By.id("btnSave"));
		// getDriverInstance().findElement(By.id("btnSave")).click();
		// getDriverInstance().findElement(By.id("btnSave")).click();
	}

	public void enterMoreDetail(String personalId, String gender) {

		if(getDriverInstance().findElement(By.xpath("//input[@value='Edit']")).isDisplayed())
		{
			SeleniumUtils.click(By.id("btnSave"));
		}
//	
		//getDriverInstance().findElement(By.id("btnSave")).click();

		
		SeleniumUtils.sendKey(By.id("personal_txtOtherID"), personalId);
//		getDriverInstance().findElement(By.id("personal_txtOtherID")).sendKeys(personalId);
		if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
			getDriverInstance().findElement(By.id("personal_optGender_2")).click();
		} else {
			getDriverInstance().findElement(By.id("personal_optGender_1")).click();
		}
		Select dropdown15 = new Select(getDriverInstance().findElement(By.id("personal_cmbMarital")));
		dropdown15.selectByIndex(2);

		SeleniumUtils.click(By.id("btnSave"));
	//	getDriverInstance().findElement(By.id("btnSave")).click();
	}


}
