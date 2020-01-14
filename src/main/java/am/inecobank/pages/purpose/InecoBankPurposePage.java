package am.inecobank.pages.purpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankPurposePage extends InecoBankMenuPage{

	public InecoBankPurposePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankPurposePageXpaths.PURPOSE_TEXT)
	public WebElement purposeText;

}
