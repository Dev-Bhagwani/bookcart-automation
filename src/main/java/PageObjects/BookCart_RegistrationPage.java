package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;
import ResourcePack.PropFileHandler;

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
//	public static By registerButton = By.xpath("//button/span[text()='Register']");
	public static By registerButton = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
	
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
//		driver.findElement(UsernameTextField).sendKeys(prop.getProperty("UserName"));
//		String newUserNameString = prop.getProperty("UserName")+TimeStamp();
		
		String newUserNameString = PropFileHandler.readProperty("FirstName")+TimeStamp();
		driver.findElement(UsernameTextField).sendKeys(newUserNameString);
		System.out.println("newUserNameString: "+newUserNameString);
		
		
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
		PropFileHandler.writeProperty("NewUsername", "ashcdv21");
	}
	
 	public void ClickingRegisterButton() {
 		waitForElementToBeVisibile(registerButton);
		driver.findElement(registerButton).click();//using click by javascript
	}
}
