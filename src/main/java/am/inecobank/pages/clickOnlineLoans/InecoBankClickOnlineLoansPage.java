package am.inecobank.pages.clickOnlineLoans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankClickOnlineLoansPage extends InecoBankMenuPage {

	public InecoBankClickOnlineLoansPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankClickOnlineLoansPageXpaths.CLICK_ONLINE_LOANS_TEXT)
	public WebElement clickOnlineLoansText;

}
