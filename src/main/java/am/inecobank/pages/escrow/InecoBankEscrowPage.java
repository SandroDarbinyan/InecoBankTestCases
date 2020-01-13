package am.inecobank.pages.escrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankEscrowPage extends InecoBankMenuPage{

	public InecoBankEscrowPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankEscrowPageXpaths.ESCROW_TEXT)
	public WebElement escrowText;

}
