package am.inecobank.pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import am.inecbank.pages.social.InecoBankSocialPage;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPage;
import am.inecobank.pages.base.InecoBankBasePageObject;
import am.inecobank.pages.escrow.InecoBankEscrowPage;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePage;
import am.inecobank.pages.inecoSave.InecoBankInecoSavePage;
import am.inecobank.pages.pension.InecoBankPensionPage;
import am.inecobank.pages.signIn.InecoBankSignInPage;
import am.inecobank.pages.signUp.InecoBankSignUpPage;
import am.inecobank.pages.specialAccounts.InecoBankSpecialAccountsPage;
import am.inecobank.pages.standard.InecoBankStandardPage;

public class InecoBankMenuPage extends InecoBankBasePageObject{

	public InecoBankMenuPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SIGN_IN_BTN)
	public WebElement signInBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SIGN_UP_BTN)
	public WebElement signUpBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.ACCOUNTS_BTN)
    public WebElement accountsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.INECO_ONE_BTN)
	WebElement inecoOneBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.STANDARD_BTN)
	WebElement standardBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.ACCOUNT_PACKAGES_BTN)
	WebElement accountPackagesBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SPECIAL_ACCOUNTS_BTN)
	public WebElement specialAccountsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.INECO_SAVE_BTN)
	public WebElement inecoSaveBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.ESCROW_BTN)
	public WebElement escrowBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.PENSION_BTN)
	public WebElement pensionBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SOCIAL_BTN)
	public WebElement socialBtn;
	
	public InecoBankSignInPage goToSignInPage() {
		signInBtn.click();
		return new InecoBankSignInPage(driver);
	}
	
	public InecoBankSignUpPage goToSignUpPage() {
		signUpBtn.click();
		return new InecoBankSignUpPage(driver);
	}
	
	public InecoBankMenuPage hoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		return new InecoBankMenuPage(driver);
	}
	
	public InecoBankInecoOnePage goToInecoOnePage() {
		inecoOneBtn.click();
		return new InecoBankInecoOnePage(driver);
	}
	
	public InecoBankStandardPage goToStandardPage() {
		standardBtn.click();
		return new InecoBankStandardPage(driver);
	}
	
	public InecoBankAccountPackagesPage goToAccountPackagesPage() {
		accountPackagesBtn.click();
		return new InecoBankAccountPackagesPage(driver);
	}
	
	public InecoBankSpecialAccountsPage goToSpecialAccountsPage() {
		specialAccountsBtn.click();
		return new InecoBankSpecialAccountsPage(driver);
	}
 
	public InecoBankInecoSavePage goToInecoSavePage() {
		inecoSaveBtn.click();
		return new InecoBankInecoSavePage(driver);
	}
	
	public InecoBankEscrowPage goToEscrowPage() {
		escrowBtn.click();
		return new InecoBankEscrowPage(driver);
	}
	
	public InecoBankPensionPage goToPensionPage() {
		pensionBtn.click();
		return new InecoBankPensionPage(driver);
	}
	
	public InecoBankSocialPage goToSocialPage() {
		socialBtn.click();
		return new InecoBankSocialPage(driver);
	}
	
}
