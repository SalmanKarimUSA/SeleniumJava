
package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
 
public class HomePage {
 
private WebDriver driver;
	
	public HomePage(WebDriver driver) {
			this.driver = driver;
	}
	        
     
    // Method to type User Name
        public void typeUsername(String Id){
        driver.findElement(By.id("user-name")).sendKeys(Id);
    }
 
    // Method to type Password
        public void typePassword(String PasswordValue){
        driver.findElement(By.id("password")).sendKeys(PasswordValue);
    }
 
    // Method to click SignIn Button
         public void clickSignIn(){
         driver.findElement(By.id("login-button")).click();
    }
 
    // Method to check HomePage Title
         public String verifyHomepageTitle() {
    	 return driver.getTitle();
     }
    
    
  // Locator for login Error Message
         By ErrorMessage=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
     
    // Method to check ErrorMessge
         public String getErrorMessage() {
    	 return driver.findElement(ErrorMessage).getText();
    }
    
        public void verifyErrorMessageDisplayed(String expectedMessage) {
    	String errorMsg = getErrorMessage();
    	Assert.assertEquals("Compare error message ["+expectedMessage+"] ", expectedMessage, errorMsg);
    }
}
