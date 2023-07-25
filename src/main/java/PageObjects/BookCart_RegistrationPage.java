package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_RegistrationPage extends BookCart_Base{
	
	public  BookCart_RegistrationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static By userRegistrationHeader = By.xpath("//h3[text()='User Registration']");
	public static By firstNameTextfield  = By.xpath("//input[@data-placeholder='First name']");
	public static By lastNameTextfield = By.xpath("//input[@data-placeholder='Last Name']");
	public static By usernameTextField = By.xpath("//input[@data-placeholder='User Name']");
	public static By passwordField = By.xpath("//input[@data-placeholder='Password']");
	public static By clickOnPasswordEyeIcon = By.xpath("(//div/mat-icon[@data-mat-icon-type='font'])[1]"); 
	public static By confirmPasswordField = By.xpath("//input[@data-placeholder='Confirm Password']");
	public static By clickOnConfirmPasswordEyeIcon = By.xpath("(//div/mat-icon[@data-mat-icon-type='font'])[2]");
	public static By maleGenderRadioButton = By.xpath("(//span[@class='mat-radio-outer-circle'])[1]");
	public static By femaleGenderRadioButton = By.xpath("(//span[@class='mat-radio-container'])[2]");
	public static By registerButton = By.xpath("//mat-card-actions/button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
	public static By errorTextUserNameIsNotAvailable = By.xpath("//mat-error[text()='User Name is not available']");
	public static By criteriaErrorTextPasswordField = By.xpath("//mat-error[@id='mat-error-0']");
	public static By loginButtonInRegisterationPage = By.xpath("(//span[@class='mat-ripple mat-button-ripple'])[5]");
	public static By confirmPasswordFieldErrorText = By.xpath("//mat-error[text()=' Password do not match ']");
	public static By errorTextFirstNameIsRequired = By.xpath("//mat-error[text()='First Name is required']");
	public static By errorTextLastNameIsRequired = By.xpath("//mat-error[text()='Last Name is required']");
	public static By errorTextUserNameIsRequired = By.xpath("//mat-error[text()='User Name is required ']");
	public static By errorTextPasswordIsRequired = By.xpath("//mat-error[text()='Password is required ']");
	
	public boolean displayingUserRegistrationHeader() {
		return driver.findElement(userRegistrationHeader).isDisplayed();
	}
	
	public void enterDataInFirstNameTextfield() {
		driver.findElement(firstNameTextfield).sendKeys(prop.getProperty("FirstName"));
	}
	
	public void enterSingleCharacterInFirstNameTextField() {
		driver.findElement(firstNameTextfield).sendKeys(prop.getProperty("FirstNameSingleCharacter"));  // for single character
	}
	
	public void enterDataInLastNameTextField() {
		driver.findElement(lastNameTextfield).sendKeys(prop.getProperty("LastName"));
	}
	
	public void enterSingleCharacterInLastNameTextField() {
		driver.findElement(lastNameTextfield).sendKeys(prop.getProperty("LastNameSingleCharacter"));
	}
	
	public void enterDataInUserNameTextfield() {
		driver.findElement(usernameTextField).sendKeys(prop.getProperty("UserName"));
	}
	
	public void enterDataInPasswordField() {
		driver.findElement(passwordField).sendKeys(prop.getProperty("Password"));
	}
	
	public void  enterWrongCriteriaInPassowrdField() {
		 driver.findElement(passwordField).sendKeys(prop.getProperty("WrongPasswordCriteria"));
	}
	
	public void enterWrongCriteriaInConfirmPasswordField() {
		driver.findElement(confirmPasswordField).sendKeys(prop.getProperty("WrongPasswordCriteria"));
	}
	
	public void clickPasswordEyeIcon() {
		driver.findElement(clickOnPasswordEyeIcon).click();
	}
	
	public void enterDataInConfirmPasswordField() {
		driver.findElement(confirmPasswordField).sendKeys(prop.getProperty("Password"));
	}
	
	public void clickConfirmPasswordEyeIcon() {
		driver.findElement(clickOnPasswordEyeIcon).click();
	}
	
	public void clickOnMaleRadioButton() {
		driver.findElement(maleGenderRadioButton).click();
	}
	
 	public void clickRegisterButton() {
		driver.findElement(registerButton).click();
	}
 	
 	public boolean displayingUserNameIsNotAvailable() {
 		return driver.findElement(errorTextUserNameIsNotAvailable).isDisplayed();
 	}
 	
 	public boolean displayingCriteriaErrorTextInPasswordField() { 
 		return driver.findElement(criteriaErrorTextPasswordField).isDisplayed();
 	}
 	
 	public void clickLoginButtonInRegistrationPage() {
 		driver.findElement(loginButtonInRegisterationPage).click();
 	}
 	
 	public boolean confirmPasswordErrorMessage()  {
 		return driver.findElement(confirmPasswordFieldErrorText).isDisplayed();
 	}
 	
 	public void clickFirstNameTextField() {
 		driver.findElement(firstNameTextfield).click();
 	}
 	
 	public boolean displayingErrorFirstNameIsRequired() {
 		return driver.findElement(errorTextFirstNameIsRequired).isDisplayed();
 	}
 	
 	public void clickLastNameTextField() {
 		driver.findElement(lastNameTextfield).click();
 	}
 	
 	public boolean displayingErrorLastNameIsRequired() {
 		return driver.findElement(errorTextLastNameIsRequired).isDisplayed();
 	}
 	
 	public void clickUserNameTextField() {
 		driver.findElement(usernameTextField).click(); 	
 	}
 	
 	public boolean displayingErrorUserNameIsRequired() {
 		return driver.findElement(errorTextUserNameIsRequired).isDisplayed();
 	}
 	
 	public void clickPasswordField() {
 		driver.findElement(passwordField).click();
 	}
 	
 	public boolean displayingErrorPasswordIsRequired() {
 		return driver.findElement(errorTextPasswordIsRequired).isDisplayed();
 	}
 	
 	public void clickConfirmPasswordField() {
 		driver.findElement(confirmPasswordField).click();
 	}
 	
 	public void clickOnFemaleRadioButton() {
 		driver.findElement(femaleGenderRadioButton).click();
 	}
 }
