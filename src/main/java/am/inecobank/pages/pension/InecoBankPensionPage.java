package am.inecobank.pages.pension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankPensionPage extends InecoBankMenuPage{

	public InecoBankPensionPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankPensionPageXpaths.PENSION_TEXT)
	public WebElement pensionText;
}
