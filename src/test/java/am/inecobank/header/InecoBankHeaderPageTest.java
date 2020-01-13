package am.inecobank.header;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.inecobank.base.InecoBankBaseTest;
import am.inecobank.pages.header.InecoBankHeaderPage;
import am.inecobank.pages.home.InecoBankHomePage;
import am.inecobank.pages.home.InecoBankHomePageXpaths;
import am.inecobank.pages.map.InecoBankMapPage;
import am.inecobank.pages.map.InecoBankMapPageXpaths;

public class InecoBankHeaderPageTest extends InecoBankBaseTest {

	// Test Case ID: 1
	// Test Case Description: Map button functionality checking
	@Test
	public void mapBtnFunctionalityTest() {
		InecoBankHeaderPage pages = new InecoBankHeaderPage(driver);
		// Step 1.2: Click on the Map button
		InecoBankMapPage page = pages.goToMapPage();
		page.waitForElementPresent(page.mapText);
		Assert.assertTrue(page.isElementPresent(InecoBankMapPageXpaths.MAP_TEXT));
	}
	
	// Test Case ID: 4
	// Test Case Description: Individuals button functionality checking
	@Test
	public void individualsBtnFunctionalityTest() {
		InecoBankHeaderPage pages = new InecoBankHeaderPage(driver);
		// Step 4.2: Click on the Individuals button
		InecoBankHomePage page = pages.clickOnIndividualsBtn();
		page.waitForElementPresent(page.element);
		Assert.assertTrue(page.isElementPresent(InecoBankHomePageXpaths.HOME_ELEMENT));
	}

}
