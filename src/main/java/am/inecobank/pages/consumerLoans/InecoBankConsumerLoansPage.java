package am.inecobank.pages.consumerLoans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankConsumerLoansPage extends InecoBankMenuPage{

	public InecoBankConsumerLoansPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankConsumerLoansPageXpaths.CONSUMER_LOANS_TEXT)
	public WebElement consumerLoansText;

}
