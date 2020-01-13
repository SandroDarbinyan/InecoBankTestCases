package am.inecobank.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankHomePage extends InecoBankMenuPage{

	public InecoBankHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankHomePageXpaths.HOME_ELEMENT)
	public	WebElement element;

}
