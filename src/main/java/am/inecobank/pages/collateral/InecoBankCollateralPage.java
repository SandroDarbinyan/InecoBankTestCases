package am.inecobank.pages.collateral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankCollateralPage extends InecoBankMenuPage{

	public InecoBankCollateralPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankCollateralXpaths.COLLATERAL_TEXT)
	public WebElement collateralText;

}
