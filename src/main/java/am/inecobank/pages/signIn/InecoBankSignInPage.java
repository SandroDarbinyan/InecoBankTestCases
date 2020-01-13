package am.inecobank.pages.signIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSignInPage extends InecoBankMenuPage{

	public InecoBankSignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankSignInPageXpaths.LOG_IN)
	public WebElement logIn;

}
