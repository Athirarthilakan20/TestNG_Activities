package testNGTests;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LMS_Activity1 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }
  @Test
  public void f() {
	// Check the title of the page
      String title = driver.getTitle();
    //Actual title
	  String actualTitle="Alchemy LMS – An LMS Application";
          
      //Match the actual and page titles
      Assert.assertEquals(title, actualTitle);
    
  }
  @AfterMethod
  public void afterMethod() {
	  //Close the browser
      driver.quit();  }

}
