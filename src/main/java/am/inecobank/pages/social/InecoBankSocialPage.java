package am.inecobank.pages.social;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSocialPage extends InecoBankMenuPage{

	public InecoBankSocialPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankSocialPageXpaths.SOCIAL_TEXT)
	public WebElement socialText;

}
