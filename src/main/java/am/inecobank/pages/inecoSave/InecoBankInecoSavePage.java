package am.inecobank.pages.inecoSave;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.menu.InecoBankMenuPage;

public class InecoBankInecoSavePage extends InecoBankMenuPage{

	public InecoBankInecoSavePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = InecoBankInecoSavePageXpaths.INECO_SAVE_TEXT)
	public WebElement inecoSaveText;

}
