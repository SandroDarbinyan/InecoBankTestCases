package am.inecobank.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InecoBankBasePageObject{

	protected WebDriver driver;
	

	public InecoBankBasePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public boolean isElementPresent(String xpath) {
		if(driver.findElements(By.xpath(xpath)).size()>0) 
			 return true;
		else return false;
	}
	
	
}
