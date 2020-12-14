package com.ip.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRMLogoutPage {

	WebDriver driver;
	
	public CRMLogoutPage(WebDriver driver) {
		this.driver=driver;
		}
	By clicksetting = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div");
	By clicklogout = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/div/a[5]/span");
	
	public void setClickSetting() {
		driver.findElement(clicksetting).click();
	}
	
	public void setClickLogout() {
		driver.findElement(clicklogout).click();
		System.out.println("Logout Successfully");
	}
}
