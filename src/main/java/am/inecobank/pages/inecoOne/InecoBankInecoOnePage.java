package am.inecobank.pages.inecoOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankInecoOnePage extends InecoBankMenuPage{

	public InecoBankInecoOnePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = InecoBankInecoOnePageXpaths.TEXT)
	public WebElement text;

}
