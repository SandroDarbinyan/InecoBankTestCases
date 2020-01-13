package am.inecobank.pages.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankSignUpPage extends InecoBankMenuPage{

	public InecoBankSignUpPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankSignUpPageXpaths.REGISTER_BTN)
	public WebElement registerBtn;

}
