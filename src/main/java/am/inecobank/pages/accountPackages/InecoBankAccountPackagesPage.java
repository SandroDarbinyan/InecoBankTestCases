package am.inecobank.pages.accountPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankAccountPackagesPage extends InecoBankMenuPage{

	public InecoBankAccountPackagesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankAccountPackagesPageXpaths.ACCOUNT_PACKAGES_TEXT)
	public WebElement accountPackagesText;
}
