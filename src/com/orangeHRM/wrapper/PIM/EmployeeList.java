package com.orangeHRM.wrapper.PIM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.orangeHRM.baseclasses.SeleniumBrowser;
import com.orangeHRM.baseclasses.SeleniumUtils;

public class EmployeeList extends SeleniumBrowser { 
	
	
		public void clickOnPim() {
		WebElement Element2=getDriverInstance().findElement(By.id("menu_pim_viewPimModule"));
		//SeleniumUtils.actionsClass(Element2);
		Actions a11=new Actions(getDriverInstance());  
		a11.moveToElement(Element2).build().perform();
		 
		//Thread.sleep(2000);
		SeleniumUtils.click(By.id("menu_pim_viewEmployeeList"));
	//	getDriverInstance().findElement(By.id("menu_pim_viewEmployeeList")).click(); 
		Reporter.log("Clicked on PIM",true);
		}
		
		public void clickOnEmpList() {
		WebElement Element3=getDriverInstance().findElement(By.id("menu_pim_viewEmployeeList"));
		//SeleniumUtils.actionsClass(Element3);
		Actions a12=new Actions(getDriverInstance()); 
		a12.moveToElement(Element3).click(); 
		Reporter.log("Clicked on EmployeeList",true);
		}
		
		public void enterEmpName(String empName) throws InterruptedException {
			SeleniumUtils.sendKey(By.id("empsearch_employee_name_empName"), empName);
		//getDriverInstance().findElement(By.id("empsearch_employee_name_empName")).sendKeys(empName);
		Reporter.log("Employee Name Entered");
	    Thread.sleep(1000);
		}
		
		public void enterEmpId(String empId) { 
			SeleniumUtils.sendKey(By.id("empsearch_id"), empId);
	    //getDriverInstance().findElement(By.id("empsearch_id")).sendKeys(empId); 
	    Reporter.log("Employee ID Entered");
		}
		
		public void EmpStatus() throws InterruptedException {
	    Select dropdown1=new Select(getDriverInstance().findElement(By.id("empsearch_employee_status")));
		dropdown1.selectByVisibleText("Full-Time Contract");
		Thread.sleep(1000);
		}
		
		public void Include() throws InterruptedException {
		Select dropdown2=new Select(getDriverInstance().findElement(By.id("empsearch_termination")));
		dropdown2.selectByVisibleText("Current Employees Only");
		Thread.sleep(1000);
		}
		
		public void clickOnSearch() {
			
			SeleniumUtils.click(By.id("searchBtn"));
		//getDriverInstance().findElement(By.id("searchBtn")).click();
	}
	}

