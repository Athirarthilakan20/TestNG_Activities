package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LMS_Activity9 {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	//Create a new instance of the Firefox driver
      driver = new FirefoxDriver();
      
      //Open browser
      driver.get("https://alchemy.hguy.co/lms");
            WebElement elementName = driver.findElement(By.LocatorStrategy("All Courses"));
  }
  @Test
  public void f() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
