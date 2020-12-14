package com.ip.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRMLoginPage {
 
	WebDriver driver;
	 
	public CRMLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginbtn = By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a");
	By username = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input");
	By password = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input");
	By login  = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
	
	public void clickOnLogin() {
		driver.findElement(loginbtn).click();;
	}
	
	public void setUserName(String struserName) {
		driver.findElement(username).sendKeys(struserName);
	}
	
	public void setPassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}
	
	public void loginClick() {
		driver.findElement(login).click();
	}
	
	public void loginData(String struserName, String strpassword) {
		this.clickOnLogin();
		 this.setUserName(struserName);
	      this.setPassword(strpassword);
	      this.loginClick();
		
	}
	
}
