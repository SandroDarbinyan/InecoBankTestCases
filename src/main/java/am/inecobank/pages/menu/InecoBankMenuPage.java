package am.inecobank.pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.GoldPledgeSecured.InecoBankGoldPledgeSecuredPage;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPage;
import am.inecobank.pages.base.InecoBankBasePageObject;
import am.inecobank.pages.bonds.InecoBankBondsPage;
import am.inecobank.pages.clickOnlineLoans.InecoBankClickOnlineLoansPage;
import am.inecobank.pages.collateralSecured.InecoBankCollateralSecuredPage;
import am.inecobank.pages.consumerLoans.InecoBankConsumerLoansPage;
import am.inecobank.pages.depositSecured.InecoBankDepositSecuredPage;
import am.inecobank.pages.deposits.InecoBankDepositsPage;
import am.inecobank.pages.escrow.InecoBankEscrowPage;
import am.inecobank.pages.expressConsumerLoans.InecoBankExpressConsumerLoansPage;
import am.inecobank.pages.flexibleDeposit.InecoBankFlexibleDepositPage;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePage;
import am.inecobank.pages.inecoSave.InecoBankInecoSavePage;
import am.inecobank.pages.mortgageLoans.InecoBankMortgageLoansPage;
import am.inecobank.pages.pension.InecoBankPensionPage;
import am.inecobank.pages.purpose.InecoBankPurposePage;
import am.inecobank.pages.signIn.InecoBankSignInPage;
import am.inecobank.pages.signUp.InecoBankSignUpPage;
import am.inecobank.pages.simpleDeposit.InecoBankSimpleDepositPage;
import am.inecobank.pages.social.InecoBankSocialPage;
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
	
	@FindBy(xpath = InecoBankMenuPageXpaths.INECO_SAVE_ACCOUNTS_BTN)
	public WebElement inecoSaveAccountsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.ESCROW_BTN)
	public WebElement escrowBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.PENSION_BTN)
	public WebElement pensionBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SOCIAL_BTN)
	public WebElement socialBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SAVINGS_BTN)
    public WebElement savingsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.DEPOSITS_BTN)
    public WebElement depositsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.SIMPLE_DEPOSIT_BTN)
    public WebElement simpleDepositBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.FLEXIBLE_DEPOSIT_BTN)
    public WebElement flexibleDepositBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.INECO_SAVE_SAVINGS_BTN)
    public WebElement inecoSaveSavingsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.PURPOSE_BTN)
    public WebElement purposeBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.BONDS_BTN)
    public WebElement bondsBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.LOANS_BTN)
    public WebElement loansBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.CLICK_ONLINE_LOANS_BTN)
    public WebElement clickOnlineLoansBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.CONSUMER_LOANS_BTN)
	public WebElement consumerLoansBtn;

	
	@FindBy(xpath = InecoBankMenuPageXpaths.EX_CONSUMER_LOANS_BTN)
	public WebElement exConsumerLoansBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.COLLATERAL_SECURED_BTN)
	public WebElement collateralSecuredBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.GOLD_PLEDGE_SECURED_BTN)
	public WebElement goldPledgeSecuredBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.DEPOSIT_SECURED_BTN)
	public WebElement depositSecuredBtn;
	
	@FindBy(xpath = InecoBankMenuPageXpaths.MORTGAGE_LOANS_BTN)
	public WebElement mortgageLoansBtn;
	
	
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
 
	public InecoBankInecoSavePage goToInecoSaveAccountsPage() {
		inecoSaveAccountsBtn.click();
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
	
	
	public InecoBankDepositsPage goToDepositsPage() {
		depositsBtn.click();
		return new InecoBankDepositsPage(driver);
	}
	
	public InecoBankSimpleDepositPage goToSimpleDepositPage() {
		simpleDepositBtn.click();
		return new InecoBankSimpleDepositPage(driver);
	}
	
	public InecoBankFlexibleDepositPage goToFlexibleDepositPage() {
		flexibleDepositBtn.click();
		return new InecoBankFlexibleDepositPage(driver);
	}
	
	public InecoBankInecoSavePage goToInecoSaveSavingsPage() {
		inecoSaveSavingsBtn.click();
		return new InecoBankInecoSavePage(driver);
	}
	
	public InecoBankPurposePage goToPurposePage() {
		purposeBtn.click();
		return new InecoBankPurposePage(driver);
	} 
	
	public InecoBankBondsPage goToBondsPage() {
		bondsBtn.click();
		return new InecoBankBondsPage(driver);
	}
	
	
	public InecoBankClickOnlineLoansPage goToClickOnlineLoansPage() {
		clickOnlineLoansBtn.click();
		return new InecoBankClickOnlineLoansPage(driver);
	}
	
	
	public InecoBankConsumerLoansPage goToConsumerLoansPage() {
		consumerLoansBtn.click();
		return new InecoBankConsumerLoansPage(driver);
	}
	
	public InecoBankExpressConsumerLoansPage goToExpressConsumerLoansPage() {
		exConsumerLoansBtn.click();
		return new InecoBankExpressConsumerLoansPage(driver);
	}
	
	public InecoBankCollateralSecuredPage goToCollateralSecuredPage() {
		collateralSecuredBtn.click();
		return new InecoBankCollateralSecuredPage(driver);
	}
	
	public InecoBankGoldPledgeSecuredPage goToGoldPledgeSecuredPage() {
		goldPledgeSecuredBtn.click();
		return new InecoBankGoldPledgeSecuredPage(driver);
	}
	
	public InecoBankDepositSecuredPage goToDepositSecuredPage() {
		depositSecuredBtn.click();
		return new InecoBankDepositSecuredPage(driver);
	}
	
	public InecoBankMortgageLoansPage goToMortgageLoansPage() {
		mortgageLoansBtn.click();
		return new InecoBankMortgageLoansPage(driver);
	}
	
}
