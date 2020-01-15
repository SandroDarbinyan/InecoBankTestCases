package am.inecobank.pages.expressConsumerLoans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankExpressConsumerLoansPage extends InecoBankMenuPage{

	public InecoBankExpressConsumerLoansPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankExpressConsumerLoansPageXpaths.EX_CONSUMER_LOANS_TEXT)
	public WebElement exConsumerLoansText;
}
