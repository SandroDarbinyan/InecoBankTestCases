package am.inecobank.pages.social;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSocialPackagePage extends InecoBankMenuPage{

	public InecoBankSocialPackagePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankSocialPackagePageXpaths.SOCIAL_PACKAGE_TEXT)
	public WebElement socialText;

}
