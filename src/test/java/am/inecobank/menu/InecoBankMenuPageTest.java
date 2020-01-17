package am.inecobank.menu;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecbank.pages.social.InecoBankSocialPage;
import am.inecbank.pages.social.InecoBankSocialPageXpaths;
import am.inecobank.base.InecoBankBaseTest;
import am.inecobank.inecoSave.InecoBankInecoSavePage;
import am.inecobank.inecoSave.InecoBankInecoSavePageXpaths;
import am.inecobank.pages.GoldPledgeSecured.InecoBankGoldPledgeSecuredPage;
import am.inecobank.pages.GoldPledgeSecured.InecoBankGoldPledgeSecuredPageXpaths;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPage;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPageXpaths;
import am.inecobank.pages.bonds.InecoBankBondsPage;
import am.inecobank.pages.bonds.InecoBankBondsPageXpaths;
import am.inecobank.pages.clickOnlineLoans.InecoBankClickOnlineLoansPage;
import am.inecobank.pages.clickOnlineLoans.InecoBankClickOnlineLoansPageXpaths;
import am.inecobank.pages.collateralSecured.InecoBankCollateralSecuredPage;
import am.inecobank.pages.collateralSecured.InecoBankCollateralSecuredPageXpaths;
import am.inecobank.pages.consumerLoans.InecoBankConsumerLoansPage;
import am.inecobank.pages.consumerLoans.InecoBankConsumerLoansPageXpaths;
import am.inecobank.pages.depositSecured.InecoBankDepositSecuredPage;
import am.inecobank.pages.depositSecured.InecoBankDepositSecuredPageXpaths;
import am.inecobank.pages.deposits.InecoBankDepositsPage;
import am.inecobank.pages.deposits.InecoBankDepositsPageXpaths;
import am.inecobank.pages.escrow.InecoBankEscrowPage;
import am.inecobank.pages.escrow.InecoBankEscrowPageXpaths;
import am.inecobank.pages.expressConsumerLoans.InecoBankExpressConsumerLoansPage;
import am.inecobank.pages.expressConsumerLoans.InecoBankExpressConsumerLoansPageXpaths;
import am.inecobank.pages.flexibleDeposit.InecoBankFlexibleDepositPage;
import am.inecobank.pages.flexibleDeposit.InecoBankFlexibleDepositPageXpaths;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePage;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePageXpaths;
import am.inecobank.pages.menu.InecoBankMenuPage;
import am.inecobank.pages.mortgageLoans.InecoBankMortgageLoansPage;
import am.inecobank.pages.mortgageLoans.InecoBankMortgageLoansPageXpaths;
import am.inecobank.pages.pension.InecoBankPensionPage;
import am.inecobank.pages.pension.InecoBankPensionPageXpaths;
import am.inecobank.pages.purpose.InecoBankPurposePage;
import am.inecobank.pages.purpose.InecoBankPurposePageXpaths;
import am.inecobank.pages.signIn.InecoBankSignInPage;
import am.inecobank.pages.signIn.InecoBankSignInPageXpaths;
import am.inecobank.pages.signUp.InecoBankSignUpPage;
import am.inecobank.pages.signUp.InecoBankSignUpPageXpaths;
import am.inecobank.pages.simpleDeposit.InecoBankSimpleDepositPage;
import am.inecobank.pages.simpleDeposit.InecoBankSimpleDepositPageXpaths;
import am.inecobank.pages.specialAccounts.InecoBankSpecialAccountsPage;
import am.inecobank.pages.specialAccounts.InecoBankSpecialAccountsPageXpaths;
import am.inecobank.pages.standard.InecoBankStandardPage;
import am.inecobank.pages.standard.InecoBankStandardPageXpaths;

public class InecoBankMenuPageTest extends InecoBankBaseTest {

	// Test Case ID: 2
	// Test Case Description: Sign in button functionality checking
	@Test
	public void signInBtnFunctionalityTest() {

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		// Step 2.2: Click on the login button
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		page.waitForElementPresent(page.logInBtn);
		Assert.assertTrue(page.isElementPresent(InecoBankSignInPageXpaths.LOG_IN));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}

	// Test Case ID: 3
	// Test Case Description: Sign up button functionality checking
	@Test
	public void signUpBtnFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 3.2: Click on the sign up button
		InecoBankSignUpPage page = pages.goToSignUpPage();
		page.waitForElementPresent(page.registerBtn);
		Assert.assertTrue(page.isElementPresent(InecoBankSignUpPageXpaths.REGISTER_BTN));
	}

	// Test Case ID: 5
	// Test Case Description: InecoOne link functionality checking
	@Test
	public void inecoOneLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 5.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		// Step 5.3: Click on InecoOne button from opened option
		InecoBankInecoOnePage page = pages.goToInecoOnePage();
		page.waitForElementPresent(page.text);
		Assert.assertTrue(page.isElementPresent(InecoBankInecoOnePageXpaths.TEXT));
	}

	// Test Case ID: 6
	// Test Case Description: Standard link functionality checking
	@Test
	public void standardLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 6.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		// Step 6.3: Click on Standard button from opened option
		InecoBankStandardPage page = pages.goToStandardPage();
		page.waitForElementPresent(page.standardText);
		Assert.assertTrue(page.isElementPresent(InecoBankStandardPageXpaths.STANDARD_TEXT));
	}

	// Test Case ID: 7
	// Test Case Description: Account Packages link functionality checking
	@Test
	public void accountPackagesLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 7.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		// Step 7.3: Click on Standard button from opened option
		InecoBankAccountPackagesPage page = pages.goToAccountPackagesPage();
		page.waitForElementPresent(page.accountPackagesText);
		Assert.assertTrue(page.isElementPresent(InecoBankAccountPackagesPageXpaths.ACCOUNT_PACKAGES_TEXT));
	}

	// Test Case ID: 8
	// Test Case Description: Special Accounts link functionality checking
	@Test
	public void specialAccountsLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 8.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.specialAccountsBtn);
		// Step 8.3: Click on Standard button from opened option
		InecoBankSpecialAccountsPage page = pages.goToSpecialAccountsPage();
		page.waitForElementPresent(page.specialAccountsText);
		Assert.assertTrue(page.isElementPresent(InecoBankSpecialAccountsPageXpaths.SPECIAL_ACCOUNTS_TEXT));
	}

	// Test Case ID: 9
	// Test Case Description: InecoSaveAccounts link functionality checking
	@Test
	public void inecoSaveAccountsLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 9.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.inecoSaveAccountsBtn);
		// Step 9.3: Click on Standard button from opened option
		InecoBankInecoSavePage page = pages.goToInecoSaveAccountsPage();
		page.waitForElementPresent(page.inecoSaveText);
		Assert.assertTrue(page.isElementPresent(InecoBankInecoSavePageXpaths.INECO_SAVE_TEXT));
	}

	// Test Case ID: 10
	// Test Case Description: Escrow link functionality checking
	@Test
	public void escrowLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 10.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.escrowBtn);
		// Step 10.3: Click on Escrow button from opened option
		InecoBankEscrowPage page = pages.goToEscrowPage();
		page.waitForElementPresent(page.escrowText);
		Assert.assertTrue(page.isElementPresent(InecoBankEscrowPageXpaths.ESCROW_TEXT));
	}
	
	// Test Case ID: 11
	// Test Case Description: Pension link functionality Checking
	@Test
	public void pensionLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 11.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.accountsBtn);
		// Step 11.3: Click on Pension button from opened option
		InecoBankPensionPage page = pages.goToPensionPage();
		page.waitForElementPresent(page.pensionText);
		Assert.assertTrue(page.isElementPresent(InecoBankPensionPageXpaths.PENSION_TEXT));
	}
	
	
	// Test Case ID: 12
	// Test Case Description: Social link functionality Checking
	@Test
	public void socialLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 12.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.socialBtn);
		// Step 12.3: Click on Social button from opened option
		InecoBankSocialPage page = pages.goToSocialPage();
		page.waitForElementPresent(page.socialText);
		Assert.assertTrue(page.isElementPresent(InecoBankSocialPageXpaths.SOCIAL_TEXT));
	}
	
	// Test Case ID: 13
	// Test Case Description: Deposits link functionality checking
	@Test
	public void depositsLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 13.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.depositsBtn);
		// Step 13.3: Click on Deposits button from opened option
		InecoBankDepositsPage page = pages.goToDepositsPage();
		page.waitForElementPresent(page.depositsText);
		Assert.assertTrue(page.isElementPresent(InecoBankDepositsPageXpaths.DEPOSITS_TEXT));
	}
	
	// Test Case ID: 14
	// Test Case Description: Simple Deposit link functionality checking
	@Test
	public void simpleDepositLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 14.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.simpleDepositBtn);
		// Step 14.3: Click on Simple Deposit button from opened option
		InecoBankSimpleDepositPage page = pages.goToSimpleDepositPage();
		page.waitForElementPresent(page.simpleDepositText);
		Assert.assertTrue(page.isElementPresent(InecoBankSimpleDepositPageXpaths.SIMPLE_DEPOSIT_TEXT));
	}
	
	// Test Case ID: 15
	// Test Case Description: Flexible Deposit link functionality checking
	@Test
	public void flexibleDepositLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 15.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.flexibleDepositBtn);
		// Step 15.3: Click on Flexible button from opened option
		InecoBankFlexibleDepositPage page = pages.goToFlexibleDepositPage();
		page.waitForElementPresent(page.flexibleDepositText);
		Assert.assertTrue(page.isElementPresent(InecoBankFlexibleDepositPageXpaths.FLEXIBLE_DEPOSIT_TEXT));
	}
	
	// Test Case ID: 16
	// Test Case Description: InecoSaveAccounts link functionality checking
	@Test
	public void inecoSaveSavingsLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 16.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.inecoSaveSavingsBtn);
		// Step 16.3: Click on Ineco Save button from opened option
		InecoBankInecoSavePage page = pages.goToInecoSaveSavingsPage();
		page.waitForElementPresent(page.inecoSaveText);
		Assert.assertTrue(page.isElementPresent(InecoBankInecoSavePageXpaths.INECO_SAVE_TEXT));
	}
	
	// Test Case ID: 17
	// Test Case Description: Purpose link functionality checking
	@Test
	public void purposeLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 17.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.purposeBtn);
		// Step 17.3: Click on Purpose button from opened option
		InecoBankPurposePage page = pages.goToPurposePage();
		page.waitForElementPresent(page.purposeText);
		Assert.assertTrue(page.isElementPresent(InecoBankPurposePageXpaths.PURPOSE_TEXT));
	}
	
	// Test Case ID: 18
	// Test Case Description: Bonds link functionality checking
	@Test
	public void bondsLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 18.2: Hover on the Savings button from menu bar
		pages.hoverOnElement(pages.savingsBtn);
		pages.waitForElementPresent(pages.bondsBtn);
		// Step 18.3: Click on Bonds button from opened option
		InecoBankBondsPage page = pages.goToBondsPage();
		page.waitForElementPresent(page.bondsText);
		Assert.assertTrue(page.isElementPresent(InecoBankBondsPageXpaths.BONDS_TEXT));
	}
	
	
	// Test Case ID: 19
	// Test Case Description: Consumer Loans link  functionality checking
	@Test
	public void consumerLoansLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 19.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.consumerLoansBtn);
		// Step 19.3: Click on Consumer Loans button from opened option
		InecoBankConsumerLoansPage page = pages.goToConsumerLoansPage();
		page.waitForElementPresent(page.consumerLoansText);
		Assert.assertTrue(page.isElementPresent(InecoBankConsumerLoansPageXpaths.CONSUMER_LOANS_TEXT));
	}

	
	
	// Test Case ID: 20
	// Test Case Description: 1 CLICK Online Loans link functionality checking
	@Test
	public void clickOnlineLoansLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 20.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.clickOnlineLoansBtn);
		// Step 20.3: Click on Bonds button from opened option
		InecoBankClickOnlineLoansPage page = pages.goToClickOnlineLoansPage();
		page.waitForElementPresent(page.clickOnlineLoansText);
		Assert.assertTrue(page.isElementPresent(InecoBankClickOnlineLoansPageXpaths.CLICK_ONLINE_LOANS_TEXT));
	}
	
	// Test Case ID: 21
	// Test Case Description: Express Consumer Loans link functionality checking
	@Test
	public void expressConsumerLoansLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 21.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.exConsumerLoansBtn);
		// Step 20.3: Click on Bonds button from opened option
		InecoBankExpressConsumerLoansPage page = pages.goToExpressConsumerLoansPage();
		page.waitForElementPresent(page.exConsumerLoansText);
		Assert.assertTrue(page.isElementPresent(InecoBankExpressConsumerLoansPageXpaths.EX_CONSUMER_LOANS_TEXT));
	}
	
	// Test case ID: 22
	// Test Case Description: Collateral Secured link functionality checking
	@Test
	public void collateralSecuredLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		//Step 22.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.collateralSecuredBtn);
		//Step 22.3: Click on the Collateral Secured button from opened option
		InecoBankCollateralSecuredPage page = pages.goToCollateralSecuredPage();
		page.waitForElementPresent(page.collateralSecuredText);
		Assert.assertTrue(page.isElementPresent(InecoBankCollateralSecuredPageXpaths.COLLATERAL_SECURED_TEXT));
		
	}
	
	// Test case ID: 23
	// Test Case Description: Gold Pledge Secured link functionality checking
	@Test
	public void goldPledgeSecuredLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 23.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.goldPledgeSecuredBtn);
		// Step 23.3: Click on the Gold Pledge Secured button from opened option
		InecoBankGoldPledgeSecuredPage page = pages.goToGoldPledgeSecuredPage();
		page.waitForElementPresent(page.goldPledgeSecuredText);
		Assert.assertTrue(page.isElementPresent(InecoBankGoldPledgeSecuredPageXpaths.GOLD_PLEDGE_SECURED_TEXT));

	}
	
	// Test case ID: 24
	// Test Case Description: Deposite Secured link functionality checking
	@Test
	public void depositSecuredLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 24.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.depositSecuredBtn);
		// Step 24.3: Click on the Deposit Secured button from opened option
		InecoBankDepositSecuredPage page = pages.goToDepositSecuredPage();
		page.waitForElementPresent(page.depositSecuredText);
		Assert.assertTrue(page.isElementPresent(InecoBankDepositSecuredPageXpaths.DEPOSIT_SECURED_TEXT));

	}

	
	// Test case ID: 25
	// Test Case Description: Mortgage Loans link functionality checking
	@Test
	public void mortgageLoansLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 25.2: Hover on the Loans button from menu bar
		pages.hoverOnElement(pages.loansBtn);
		pages.waitForElementPresent(pages.mortgageLoansBtn);
		// Step 25.3: Click on the Mortgage Loans button from opened option
		InecoBankMortgageLoansPage page = pages.goToMortgageLoansPage();
		page.waitForElementPresent(page.mortgageLoansText);
		Assert.assertTrue(page.isElementPresent(InecoBankMortgageLoansPageXpaths.MORTGAGE_LOANS_TEXT));

	}

}
