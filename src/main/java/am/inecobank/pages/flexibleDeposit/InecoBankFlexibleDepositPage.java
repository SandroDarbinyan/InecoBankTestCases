package am.inecobank.pages.flexibleDeposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankFlexibleDepositPage extends InecoBankMenuPage{

	public InecoBankFlexibleDepositPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankFlexibleDepositPageXpaths.FLEXIBLE_DEPOSIT_TEXT)
	public WebElement flexibleDepositText;
}
