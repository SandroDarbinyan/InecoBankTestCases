package am.inecobank.pages.collateralSecured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankCollateralSecuredPage extends InecoBankMenuPage{

	public InecoBankCollateralSecuredPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankCollateralSecuredPageXpaths.COLLATERAL_SECURED_TEXT)
	public WebElement collateralSecuredText;

}
