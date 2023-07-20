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
		public static By registerButton = By.xpath("//button[@class='mat-focus-indicator mat-elevation-z4 mat-raised-button mat-button-base']");
		public static By usernameTextField = By.xpath("//input[@data-placeholder='Username']");
		public static By passowrdTextField = By.xpath("//input[@data-placeholder='Password']");
		public static By loginButton = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
		
		public boolean displayingLoginLogo() {
			return driver.findElement(loginHeader).isDisplayed();
		}
		
		public boolean displayingRegisterButton() {
			return driver.findElement(registerButton).isDisplayed();
		}
		
		public void clickingRegisterButton() {
			 driver.findElement(registerButton).click();
		}
	
		public void enterDataInUsernameField() {
			driver.findElement(usernameTextField).sendKeys(prop.getProperty("UserName"));
		}
		
		public void enterDataInPasswordField() {
			driver.findElement(passowrdTextField).sendKeys(prop.getProperty("Password"));
		}
		
		public void clickingLoginButton() {
			driver.findElement(loginButton).click();
		}
}

