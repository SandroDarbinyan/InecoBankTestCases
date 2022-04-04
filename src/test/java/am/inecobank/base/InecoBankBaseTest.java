package am.inecobank.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import am.inecobank.dataProvider.ConfigFileReader;

public class InecoBankBaseTest {
	
  protected	WebDriver driver;
  ConfigFileReader configFileReader;
  
	@BeforeClass
	public void prepareEnv() throws IOException {
		
		 configFileReader= new ConfigFileReader();
			
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--window-size=1400,800");
		driver = new ChromeDriver();

		//Step *.1: Navigate to www.inecobank.am/en/Individual
		driver.get(configFileReader.getUrl());

		driver.manage().window().maximize();
		String title =  driver.getTitle();
	    Assert.assertEquals(title, "For Individual Customers | INECOBANK");
	    
	}
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
