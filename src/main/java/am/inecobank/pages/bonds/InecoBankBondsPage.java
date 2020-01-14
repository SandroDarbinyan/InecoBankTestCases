package am.inecobank.pages.bonds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankBondsPage extends InecoBankMenuPage {

	public InecoBankBondsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankBondsPageXpaths.BONDS_TEXT)
	public WebElement bondsText;

}
