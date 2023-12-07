package com.Amazon.Testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.BaseClass;

public class IphoneSearch extends BaseClass {
@Test
public void searchIphone() throws InterruptedException {
	Reporter.log("Searching for Iphone", true);
	driver.findElement(By.name("q")).sendKeys("Iphones"+Keys.ENTER);
	String iphone = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone')]")).getText();
	String price = driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')]/../../div[2]/div/div/div[1])[1]")).getText();
	System.out.println(iphone+"===>"+price);
	driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 12 (Blue, 64 GB)')]")).click();
	String phandle = driver.getWindowHandle();
	Set<String> handles = driver.getWindowHandles();
	for (String handle : handles) {
        if (!handle.equals(phandle)) {
            driver.switchTo().window(handle);
            break;
        }
    }
	//adding to cart
	driver.findElement(By.xpath("(//li[contains(@class,'col col-6-12')])[1]")).click();
	Thread.sleep(5000);
}
}
