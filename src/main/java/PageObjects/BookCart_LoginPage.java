package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_LoginPage extends BookCart_Base{
		
		public BookCart_LoginPage() {
			super();
			PageFactory.initElements(driver, this);
		}
		
		public static By loginButton = By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base ng-star-inserted']");
		public static By loginLogo = By.xpath("//h3[text()='Login']");
		public static By RegisterButton = By.xpath("//button[@class='mat-focus-indicator mat-elevation-z4 mat-raised-button mat-button-base']");
		
		public void clickingLoginButton() {
			 driver.findElement(loginButton).click();
		}
		
		public boolean DisplayingLoginLogo() {
			waitForElementToBeVisibile(loginLogo);
			return driver.findElement(loginLogo).isDisplayed();
		}
		
		public boolean DisplayingRegisterButton() {
			return driver.findElement(RegisterButton).isDisplayed();
		}
		
		public void clickingRegisterButton() {
			 driver.findElement(RegisterButton).click();

		}
}

