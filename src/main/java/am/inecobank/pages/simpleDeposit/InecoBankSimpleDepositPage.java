package am.inecobank.pages.simpleDeposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSimpleDepositPage extends InecoBankMenuPage{

	public InecoBankSimpleDepositPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankSimpleDepositPageXpaths.SIMPLE_DEPOSIT_TEXT)
	public WebElement simpleDepositText;

}
