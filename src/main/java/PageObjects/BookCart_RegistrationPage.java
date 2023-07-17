package PageObjects;

import org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_RegistrationPage extends BookCart_Base{
	
	public  BookCart_RegistrationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static By UserRegistrationHeader = By.xpath("//h3[text()='User Registration']");
	public static By FirstNameTextfield  = By.xpath("//input[@data-placeholder='First name']");
	public static By LastNameTextfield = By.xpath("//input[@data-placeholder='Last Name']");
	public static By UsernameTextField = By.xpath("//input[@data-placeholder='User Name']");
	public static By PasswordField = By.xpath("//input[@data-placeholder='Password']");
	public static By EyeButton1 = By.xpath("(//div/mat-icon[@data-mat-icon-type='font'])[1]"); 
	public static By confirmPasswordField = By.xpath("//input[@data-placeholder='Confirm Password']");
	public static By EyeButton2 = By.xpath("(//div/mat-icon[@data-mat-icon-type='font'])[2]");
	public static By GenderRadioButtonBy = By.xpath("(//span[@class='mat-radio-outer-circle'])[1]");
	public static By RegisterButton = By.xpath("//mat-card-actions/button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
	public static By errorTextUserNameIsNotAvailable = By.xpath("//mat-error[text()='User Name is not available']");
	
	public boolean DisplayingUserRegistrationHeader() {
		return driver.findElement(UserRegistrationHeader).isDisplayed();
	}
	
	public void EnteringDataInFirstNameTextfield() {
		driver.findElement(FirstNameTextfield).sendKeys(prop.getProperty("FirstName"));
	}
	
	public void EnteringDataInLastNameTextField() {
		driver.findElement(LastNameTextfield).sendKeys(prop.getProperty("LastName"));
	}
	
	public void EnteringDataInUserNameTextfield() {
		driver.findElement(UsernameTextField).sendKeys(prop.getProperty("UserName"));
	}
	
	public void EnteringDataInPasswordField() {
		driver.findElement(PasswordField).sendKeys(prop.getProperty("Password"));
	}
	
	public void ClickingEyeButton1() {
		driver.findElement(EyeButton1).click();
	}
	
	public void EnteringDataInConfirmPasswordField() {
		driver.findElement(confirmPasswordField).sendKeys(prop.getProperty("Password"));
	}
	
	public void ClickingEyeButton2() {
		driver.findElement(EyeButton2).click();
	}
	
	public void ClickingGenderRadioButton() {
		driver.findElement(GenderRadioButtonBy).click();
	}
	
 	public void ClickingRegisterButton() {
 		waitForElementToBeVisibile(RegisterButton);
		driver.findElement(RegisterButton).click();
	}
 	
 	public boolean DisplayingUserNameIsNotAvailable() {
 		waitForElementToBeVisibile(errorTextUserNameIsNotAvailable);
 		return driver.findElement(errorTextUserNameIsNotAvailable).isDisplayed();
 	}
}
