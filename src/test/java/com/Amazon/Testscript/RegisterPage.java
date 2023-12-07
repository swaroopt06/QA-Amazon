package com.Amazon.Testscript;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.BaseClass;

public class RegisterPage extends BaseClass {
@Test
public void pageRister() throws InterruptedException {
	Reporter.log("Filpkart Register page", true);
	driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart? Create an account')]")).click();
	Thread.sleep(3000);
}
}
