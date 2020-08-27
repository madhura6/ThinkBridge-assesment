import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
	
		// Setting the property for webdriver.chrome.driver 
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

        // Creating new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
        
        //creating object of Loginpage class
        Loginpage pageobj = new Loginpage();
        
        //method call to check value of drop down        
        pageobj.checkLanguage(driver);
        
        //method call to submit the form
          pageobj.submitLogin(driver);
         
          driver.quit();
	}

	
	}
