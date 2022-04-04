package am.inecobank.pages.accountPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankPlusPage extends InecoBankMenuPage{

	public InecoBankPlusPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankPlusPageXpaths.PLUS_TEXT)
	public WebElement plusText;
}
