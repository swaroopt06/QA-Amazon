package com.amazon.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() {
	Reporter.log("OpenBrowser",true);
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	}

	@AfterClass
	public void closeBrowser() {
	Reporter.log("CloseBrowser",true);	
	driver.close();
	}
	@BeforeMethod
	public void login() {
	Reporter.log("Login to Application",true);	
	}
	@AfterMethod
	public void logout() {
	Reporter.log("Logout from Application",true);
	}
}
