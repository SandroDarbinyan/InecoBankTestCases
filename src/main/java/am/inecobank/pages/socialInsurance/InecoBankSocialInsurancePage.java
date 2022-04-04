package am.inecobank.pages.socialInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSocialInsurancePage extends InecoBankMenuPage{

	public InecoBankSocialInsurancePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankSocialInsurancePageXpaths.SOCIAL_INSURANCE_TEXT)
	public WebElement socialInsuranceText;
}
