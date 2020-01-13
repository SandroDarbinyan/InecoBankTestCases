package am.inecobank.pages.specialAccounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSpecialAccountsPage extends InecoBankMenuPage{

	public InecoBankSpecialAccountsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankSpecialAccountsPageXpaths.SPECIAL_ACCOUNTS_TEXT)
	public WebElement specialAccountsText;

}
