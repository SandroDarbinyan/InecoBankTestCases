package am.inecobank.pages.deposits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankDepositsPage extends InecoBankMenuPage{

	public InecoBankDepositsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankDepositsPageXpaths.DEPOSITS_TEXT)
	public WebElement depositsText;

}
