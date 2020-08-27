import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPage {
	
	public void EmailCheck(WebDriver driver) {
	driver.get("http://www.gmail.com");
	
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	 
  	//locate the email field
  	WebElement emailElement = driver.findElement(By.id("identifierId"));
  	emailElement.sendKeys("myusername@gmail.com");     	 
    	 
  //click next button
  	driver.findElement(By.cssSelector("button[type='button']")).click();
  	
  	//locate the password field
  	WebElement password = driver.findElement(By.cssSelector("input[type='password']"));    
 	password.sendKeys("password");
    	 
  	
 	 
  	//locate  Inbox and click it
  	driver.findElement(By.linkText("Inbox")).click();
 	 
  	//look for the given text in the list of web elements   					 
  	List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Email Subject')]"));
 	 
  	//check if text has been found or not     	 
  	if(allMessages.isEmpty()) {
		   System.out.println("Test not passed");
  	}else {
		   System.out.println("Test passed");
  	}
 	
}
	
}
