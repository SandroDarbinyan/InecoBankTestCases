package am.inecobank.pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.signIn.InecoBankSignInPage;

public class InecoBankUserPage extends InecoBankSignInPage{

	public InecoBankUserPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankUserPageXpaths.SIGN_OUT_DIV)
	public WebElement signoutDiv;
	
	@FindBy(xpath = InecoBankUserPageXpaths.SIGN_OUT_BTN)
	public WebElement signoutBtn;
	
	public void logOut() throws InterruptedException {
		signoutDiv.click();
		Thread.sleep(1000);
		signoutBtn.click();
	}

	
}
