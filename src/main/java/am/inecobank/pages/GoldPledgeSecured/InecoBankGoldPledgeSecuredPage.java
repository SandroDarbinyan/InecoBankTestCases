package am.inecobank.pages.GoldPledgeSecured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankGoldPledgeSecuredPage extends InecoBankMenuPage{

	public InecoBankGoldPledgeSecuredPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankGoldPledgeSecuredPageXpaths.GOLD_PLEDGE_SECURED_TEXT)
	public WebElement goldPledgeSecuredText;

}
