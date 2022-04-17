
package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
 
public class MainPage {
 
private WebDriver driver;
	
	public MainPage(WebDriver driver) {
			this.driver = driver;
	}
	
    

    // Method to check App logo
    public void verifyAppLogo() {
    WebElement e = driver.findElement(By.xpath("//*[@class=\"app_logo\"]"));
    Assert.assertNotNull(e);
    }
    
 
    
    // Method to check MainPage Title, the PRODUCT LIST TEXT
     public void verifyMainpageTitle() {
    	 Assert.assertNotNull(driver.findElement(By.xpath("//span[@class=\"title\"]")));
     }
        public void verifyUrlIs(String urlToVerify) {
    	 Assert.assertEquals("Check url", urlToVerify, driver.getCurrentUrl());
     }
    
    }
