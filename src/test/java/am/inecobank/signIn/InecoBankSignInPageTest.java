package am.inecobank.signIn;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.InecoBankBaseTest;
import am.inecobank.pages.menu.InecoBankMenuPage;
import am.inecobank.pages.signIn.InecoBankSignInPage;
import am.inecobank.pages.signIn.InecoBankSignInPageXpaths;
import am.inecobank.pages.user.InecoBankUserPage;
import am.inecobank.pages.user.InecoBankUserPageXpaths;

public class InecoBankSignInPageTest extends InecoBankBaseTest{
	
	// Test case ID: 26
	// Test Case Description: Check Customer Sign In with valid Data
    @Test
    public void signInTest1 () throws InterruptedException {
    	// Store the current window handle
    	String winHandleBefore = driver.getWindowHandle();
    	
		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 26.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 26.3: Enter User name
		page.fillUserName("darbinyan.sandro");
		
		// Step 26.4: Enter Password
		page.fillpassword("account1");
		
		// Step	26.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertTrue(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));
		
		// LogOut
		user.logOut();
		
		// Close the new window, if that window no more required
		driver.close();
		
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
    }

	// Test case ID: 27
	// Test Case Description: Check Customer Sign In with invalid Data
	@Test
	public void signInTest2() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 27.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 27.3: Enter User name
		page.fillUserName("armen.vardanyan");

		// Step 27.4: Enter Password
		page.fillpassword("account0");

		// Step 27.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	
	
	// Test case ID: 28
	// Test Case Description: Check Customer Sign In without inputing Data
	@Test
	public void signInTest3() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 28.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 28.3: Enter User name
		page.fillUserName("");

		// Step 28.4: Enter Password
		page.fillpassword("");

		// Step 28.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	
	// Test case ID: 29
	// Test Case Description: Verify the messages for invalid login.
	@Test
	public void signInTest4() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 29.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 29.3: Enter User name
		page.fillUserName("armen.vardanyan");

		// Step 29.4: Enter Password
		page.fillpassword("account0");

		// Step 29.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));
		page.waitForElementPresent(page.errorMessage);
		Assert.assertTrue(page.isElementPresent(InecoBankSignInPageXpaths.ERROR_MESSAGE));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	
	
	// Test case ID: 30
	// Test Case Description: Check Customer Sign In with valid user name and invalid password
	@Test
	public void signInTest5() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 30.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 30.3: Enter User name
		page.fillUserName("darbinyan.sandro");

		// Step 30.4: Enter Password
		page.fillpassword("account0");

		// Step 30.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	
	// Test case ID: 31
	// Test Case Description: Check Customer Sign In with invalid user name and valid password
	@Test
	public void signInTest6() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 31.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 31.3: Enter User name
		page.fillUserName("armen.vardnyan");

		// Step 31.4: Enter Password
		page.fillpassword("account1");

		// Step 31.5.Click Log In button
		page.clickOnLoginBtn();
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	
	// Test case ID: 32
	// Test Case Description: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
	@Test
	public void signInTest7() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 32.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 32.3: Enter User name
		page.fillUserName("darbinyan.sandro");

		// Step 32.4: Enter Password
		page.fillpassword("account1");

		// Step 32.5.Click Log In button
		page.logInBtn.sendKeys(Keys.ENTER);
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertTrue(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));
		
		// LogOut
		user.logOut();
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}
	
	// Test case ID: 33
	// Test Case Description: Logout functionality check
	@Test
	public void signInTest8() throws InterruptedException {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		InecoBankMenuPage pages = new InecoBankMenuPage(driver);
		// Step 33.2: Click on the sign in button
		InecoBankSignInPage page = pages.goToSignInPage();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		// Step 33.3: Enter User name
		page.fillUserName("darbinyan.sandro");

		// Step 33.4: Enter Password
		page.fillpassword("account1");

		// Step 33.5.Click Log In button
		page.logInBtn.sendKeys(Keys.ENTER);
		InecoBankUserPage user = new InecoBankUserPage(driver);
		user.waitForElementPresent(user.signoutDiv);
		Assert.assertTrue(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Step 33.6: Click on Sign out button
		user.logOut();
		
		// Step 33.7: Click on Sign out button
		driver.navigate().back();
		Assert.assertFalse(user.isElementPresent(InecoBankUserPageXpaths.SIGN_OUT_DIV));

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
	}

	
	

}
