package com.amazon.generic;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.amazon.generic.BaseClass;

public class ListerImplementation extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {

		
	}

	public void onTestSuccess(ITestResult result) {
	
		
	}

	public void onTestFailure(ITestResult result) {
		String res= result.getName();
		TakesScreenshot s= (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/"+res+".png");
		try {
			//FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			
		}
		
	}

	public void onTestSkipped(ITestResult result) {

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	public void onStart(ITestContext context) {

		
	}

	public void onFinish(ITestContext context) {

		
	}

	}
