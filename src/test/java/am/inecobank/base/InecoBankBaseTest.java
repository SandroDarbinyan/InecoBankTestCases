package am.inecobank.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InecoBankBaseTest {
	
 protected	WebDriver driver;
	
	@BeforeClass
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Step *.1: Navigate to www.inecobank.am/en/Individual
		driver.get("https://www.inecobank.am/en/Individual");

		driver.manage().window().maximize();
		String title =  driver.getTitle();
	    Assert.assertEquals(title, "For Individual Customers | INECOBANK");
	    
	}
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
