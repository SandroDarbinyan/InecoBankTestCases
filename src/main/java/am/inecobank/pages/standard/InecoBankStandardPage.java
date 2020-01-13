package am.inecobank.pages.standard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankStandardPage extends InecoBankMenuPage{

	public InecoBankStandardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankStandardPageXpaths.STANDARD_TEXT)
	public WebElement standardText;

}
