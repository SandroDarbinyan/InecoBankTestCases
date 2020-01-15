package am.inecobank.pages.depositSecured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankDepositSecuredPage extends InecoBankMenuPage{

	public InecoBankDepositSecuredPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankDepositSecuredPageXpaths.DEPOSIT_SECURED_TEXT)
	public WebElement depositSecuredText;

}
