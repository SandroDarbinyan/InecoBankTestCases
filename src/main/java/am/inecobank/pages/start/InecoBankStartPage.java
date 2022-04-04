package am.inecobank.pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankStartPage extends InecoBankMenuPage{

	public InecoBankStartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankStartPageXpaths.TEXT)
	public WebElement text;

}
