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
	public static By loginButton = By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base ng-star-inserted']");
	public static By matIconExistingUsername = By.xpath("(//span[@class='mat-button-wrapper'])[4]");
	
	public boolean displayingHomeCartLogo() {
		return driver.findElement(bookCartLogo).isDisplayed();
	}
	
	public void clickingLoginButton() {
		 driver.findElement(loginButton).click();
	}
	
	public boolean  displayingMatIconExistingUserName() {
		return driver.findElement(matIconExistingUsername).isDisplayed();
	}
}
