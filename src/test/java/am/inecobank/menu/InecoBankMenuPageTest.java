package am.inecobank.menu;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecbank.pages.social.InecoBankSocialPage;
import am.inecbank.pages.social.InecoBankSocialPageXpaths;
import am.inecobank.base.InecoBankBaseTest;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPage;
import am.inecobank.pages.accountPackages.InecoBankAccountPackagesPageXpaths;
import am.inecobank.pages.escrow.InecoBankEscrowPage;
import am.inecobank.pages.escrow.InecoBankEscrowPageXpaths;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePage;
import am.inecobank.pages.inecoOne.InecoBankInecoOnePageXpaths;
import am.inecobank.pages.inecoSave.InecoBankInecoSavePage;
import am.inecobank.pages.inecoSave.InecoBankInecoSavePageXpaths;
import am.inecobank.pages.menu.InecoBankMenuPage;
import am.inecobank.pages.pension.InecoBankPensionPage;
import am.inecobank.pages.pension.InecoBankPensionPageXpaths;
import am.inecobank.pages.signIn.InecoBankSignInPage;
import am.inecobank.pages.signIn.InecoBankSignInPageXpaths;
import am.inecobank.pages.signUp.InecoBankSignUpPage;
import am.inecobank.pages.signUp.InecoBankSignUpPageXpaths;
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
		page.waitForElementPresent(page.logIn);
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
	// Test Case Description: InecoSave link functionality checking
	@Test
	public void inecoSaveLinkFunctionalityTest() {
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 9.2: Hover on the Accounts button from menu bar
		pages.hoverOnElement(pages.accountsBtn);
		pages.waitForElementPresent(pages.inecoSaveBtn);
		// Step 9.3: Click on Standard button from opened option
		InecoBankInecoSavePage page = pages.goToInecoSavePage();
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
		pages.waitForElementPresent(pages.inecoSaveBtn);
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
	// Test Case Description: Pension link functionality Checking
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
	
}
