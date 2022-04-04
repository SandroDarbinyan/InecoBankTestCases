package am.inecobank.pages.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecoBankBasePageObject;
import am.inecobank.pages.home.InecoBankHomePage;
import am.inecobank.pages.map.InecoBankMapPage;

public class InecoBankHeaderPage extends InecoBankBasePageObject {

	public InecoBankHeaderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = InecoBankHeaderPageXpaths.MAP_BTN)
	public WebElement mapBtn;
	
	@FindBy(xpath = InecoBankHeaderPageXpaths.INDIVIDUALS_BTN)
	WebElement individualsBtn;
	

	public InecoBankMapPage goToMapPage() {
		mapBtn.click();
		return new InecoBankMapPage(driver);
	}
	
	public InecoBankHomePage clickOnIndividualsBtn() {
		individualsBtn.click();
		return new InecoBankHomePage(driver);
	}
}
