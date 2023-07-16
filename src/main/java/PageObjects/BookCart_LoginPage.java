package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_LoginPage extends BookCart_Base{
		
		public BookCart_LoginPage() {
			super();
			PageFactory.initElements(driver, this);
		}
		
		public static By loginHeader = By.xpath("//h3[text()='Login']");
		public static By RegisterButton = By.xpath("//button[@class='mat-focus-indicator mat-elevation-z4 mat-raised-button mat-button-base']");
		public static By UsernameTextField = By.xpath("//input[@data-placeholder='Username']");
		public static By passowrdTextField = By.xpath("//input[@data-placeholder='Password']");
		public static By LoginButton = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
		
		public boolean DisplayingLoginLogo() {
			waitForElementToBeVisibile(loginHeader);
			return driver.findElement(loginHeader).isDisplayed();
		}
		
		public boolean DisplayingRegisterButton() {
			return driver.findElement(RegisterButton).isDisplayed();
		}
		
		public void clickingRegisterButton() {
			 driver.findElement(RegisterButton).click();
		}
	
		public void EnteringDataInUsernameField() {
			driver.findElement(UsernameTextField).sendKeys(prop.getProperty("UserName"));
		}
		
		public void EnteringDataInPasswordField() {
			driver.findElement(passowrdTextField).sendKeys(prop.getProperty("Password"));
		}
		
		public void ClickingLoginButton() {
			driver.findElement(LoginButton).click();
		}
}

