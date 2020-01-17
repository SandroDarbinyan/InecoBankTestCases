package am.inecobank.pages.signIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePageObject;
import am.inecobank.pages.menu.InecoBankMenuPage;
import am.inecobank.pages.user.InecoBankUserPage;
import am.inecobank.pages.user.InecoBankUserPageXpaths;

public class InecoBankSignInPage extends InecoBankMenuPage{


	public InecoBankSignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankSignInPageXpaths.USER_NAME)
	public WebElement userName;
	
	@FindBy(xpath = InecoBankSignInPageXpaths.PASSWORD)
	public WebElement password;
	
	@FindBy(xpath = InecoBankSignInPageXpaths.LOG_IN)
	public WebElement logInBtn;
	
	@FindBy(xpath = InecoBankSignInPageXpaths.ERROR_MESSAGE)
	public WebElement errorMessage;
	
	String xpath = InecoBankUserPageXpaths.SIGN_OUT_DIV;
	
	
	public InecoBankSignInPage fillUserName(String username) {
		userName.sendKeys(username);
		return new InecoBankSignInPage(driver);
	}
	
	public InecoBankSignInPage fillpassword(String pass) {
		password.sendKeys(pass);
		return new InecoBankSignInPage(driver);
	}
	
	public InecoBankBasePageObject clickOnLoginBtn() {
		logInBtn.click();
		if(isElementPresent(xpath)) {
			return new InecoBankUserPage(driver);
		} else {
		return new InecoBankSignInPage(driver); }
	}
	
	

}
