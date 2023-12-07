package com.Amazon.Testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.BaseClass;

public class ValidateFilters extends BaseClass{
@Test
public void ApplyingFilters() throws InterruptedException {
	Reporter.log("Applying Filters",true);
	driver.findElement(By.name("q")).sendKeys("smartphones"+Keys.ENTER);
	driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])/..//div[contains(text(),'SAMSUNG')]")).click();
	Thread.sleep(3000);
	 List<WebElement> lists = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG')]"));
	 if (!lists.isEmpty()) {
		 System.out.println("Filters are applied and the list is not empty");
		 System.out.println("===================================");
		for (WebElement emt : lists) {
			String text = emt.getText();
			System.out.println(text);
		}
	} else {
		System.out.println("Filters are applied and the list is empty ");
	}
	Thread.sleep(5000);	
}
}
