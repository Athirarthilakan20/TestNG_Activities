package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
private void printTestResults(ITestResult result) {
	Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);
	if (result.getParameters().length != 0) {
		String params = null;
		for (Object parameter : result.getParameters()) {
			params += parameter.toString() + ",";
		}
		Reporter.log("Test Method had the following parameters : " + params, true);
	}
	String status = null;
	switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			status = "Pass";
			break;
		case ITestResult.FAILURE:
			status = "Failed";
			break;
		case ITestResult.SKIP:
			status = "Skipped";
			break;
	}
	Reporter.log("Test Status: " + status, true);
}