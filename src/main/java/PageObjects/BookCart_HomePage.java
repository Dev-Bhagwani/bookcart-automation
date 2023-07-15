package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_HomePage extends BookCart_Base{
	
	public BookCart_HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static By bookCartLogo = By.xpath("//span[@class='mat-button-wrapper']");
	
	public boolean DisplayingHomeCartLogo() {
		waitForElementToBeVisibile(bookCartLogo);
		return driver.findElement(bookCartLogo).isDisplayed();
	}
}
