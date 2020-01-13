package am.inecobank.pages.map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.header.InecoBankHeaderPage;

public class InecoBankMapPage extends InecoBankHeaderPage{

	public InecoBankMapPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankMapPageXpaths.MAP_TEXT)
	public  WebElement mapText;

}
