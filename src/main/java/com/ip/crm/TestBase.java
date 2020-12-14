package com.ip.crm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver = null;
	
	@BeforeTest
	public void basicsSetup()  throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://freecrm.co.in/");

	}
	@Test(priority = 0)
	public void home() {
		CRMLoginPage loginpage = new CRMLoginPage(driver);
		loginpage.loginData("anubhavwhitebox@gmail.com", "muna1234");
	}
	
	@Test(priority = 1)
	public void logout() {
		CRMLogoutPage logout = new CRMLogoutPage(driver);
		logout.setClickSetting();
		logout.setClickLogout();
		
	}
	@AfterTest
	public void tearDown() {
		 TestBase.driver.quit();
	}
	
}
