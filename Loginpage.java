import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	public void checkLanguage(WebDriver driver)
	{

		   String[] Lang = {"English", "Dutch"};
		   WebElement dropdown = driver.findElement(By.id("language"));   
		   Select select = new Select(dropdown); 
		   //storing the drop down options in a list                
		   java.util.List<WebElement> options = select.getOptions(); 
		                     
		   //Iterating the drop down options and comparing with the predefined values
		   
		   				for(WebElement item:options) 
		                     { 
		                      for (int i=0; i<Lang.length; i++){
		                          if (item.getText().equals(Lang[i])){
		                          System.out.println("Matched");
		                          }
		                          else
		                          {
		                        	  System.out.println("Language not matched");
		                          }
		                        }
		                      } 
	}
	
	
	
	public  void submitLogin(WebDriver driver) 
	{

   //locating name textbox and entering value 
   WebElement nameField= driver.findElement(By.name("name"));
   nameField.sendKeys("MyName");
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    
 //locating Org name textbox and entering value 
   WebElement orgNameField = driver.findElement(By.name("orgName"));
   orgNameField.sendKeys("MyOrg");
   
      
   //locating Email textbox and entering value    
   WebElement emailField= driver.findElement(By.name("email"));
   emailField.sendKeys("abc@gmail.com");
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      
  //waiting and then clicking check box 
   new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='checkbox']"))).click();
 
  
 //locating submit button and clicking it
      WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-custom.btn-block.ng-binding"));
      submitBtn.click();
      
      
 }

}
