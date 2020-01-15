package am.inecobank.pages.mortgageLoans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankMortgageLoansPage extends InecoBankMenuPage{

	public InecoBankMortgageLoansPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankMortgageLoansPageXpaths.MORTGAGE_LOANS_TEXT)
	public WebElement mortgageLoansText;

}
