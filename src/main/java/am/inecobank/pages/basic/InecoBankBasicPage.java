package am.inecobank.pages.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankBasicPage extends InecoBankMenuPage{

	public InecoBankBasicPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankBasicPageXpaths.BASIC_TEXT)
	public WebElement basicText;

}
