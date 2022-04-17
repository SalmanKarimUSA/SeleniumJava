
package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
 
public class MainPage {
 
private WebDriver driver;
	
	public MainPage(WebDriver driver) {
			this.driver = driver;
	}
	
    
 // Locator for App Logo
    By AppLogo= By.xpath("//*[@class=\"app_logo\"]");
    
    public void verifyAppLogo() {
    driver.findElements(AppLogo);
    	
    }
    
    // Locator for Main Page Title
    By MainPageTitle= By.xpath("//span[@class=\"title\"]");
    
    // Method to check MainPage Title
     public void verifyMainpageTitle() {
     driver.findElement(MainPageTitle);
     }
    
    }
