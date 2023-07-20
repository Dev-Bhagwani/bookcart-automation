package BookCart_TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ResourcePack.BookCart_Base;

public class BookCart_TestClass extends BookCart_Base {
	
	@Test  // test case 1-2
public void testCase1_2() throws IOException, InterruptedException{
		
		// HomePage
		Assert.assertTrue(homePage.displayingHomeCartLogo());
		homePage.clickingLoginButton();
		
//		//Login Page
		Assert.assertTrue(loginPage.displayingLoginLogo());
		Assert.assertTrue(loginPage.displayingRegisterButton());
		loginPage.clickingRegisterButton();
		
		//Registrating Page
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
	}
	@Test  // Test Case -3
	public void testCase_3() throws InterruptedException {
		
		//user now navigated to Login Page
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.enterDataInUsernameField();
		loginPage.enterDataInPasswordField();
		loginPage.clickingLoginButton();
	}
	
	@Test  //Test Case -4
	// "Verify that Registration page shows alert message i.e. (User Name is not available) when entering the Existing Username 
	public void testCase_4() throws InterruptedException {
	homePage.clickingLoginButton();
	Assert.assertTrue(loginPage.displayingLoginLogo());
	loginPage.clickingRegisterButton();
	Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
	registrationPage.enterDataInUserNameTextfield();
	registrationPage.clickingRegisterButton();
	Assert.assertTrue(registrationPage.displayingUserNameIsNotAvailable());
	}
	
	@Test   // Test Case -5
	// Verify if user is able to register  without entering  First Name
	public void testCase_5() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
		// First Name appears in red color
	}
	
	@Test   // Test Case-6
	//  Verify if user is able to register  without entering  Last Name
	public void testCase_6() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
		// Last Name Appears in Red Color
	}	
	
	@Test  // Test Case -7
	// Verify if user is able to register  without entering Password & Confirm Password
	public void testCase_7() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
		// Password & Confirm Password Appears in Red Color
	}
	
	@Test  // Test Case -8
	// Verify if user is able to register  without entering the correct criteria for the Password 
	public void testCase_8() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterWrongCriteriaInPassowrdField();
		registrationPage.enterWrongCriteriaInConfirmPasswordField();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingCriteriaErrorTextInPasswordField());
	}
	
	@Test // Test Case -9
	//  Verify if user is able to register  by entering the wrong password  in Confrim Password Box
	public void testCase_9() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterWrongCriteriaInConfirmPasswordField();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.confirmPasswordErrorMessage());
	}
	
	@Test  // Test Case -10
	// Verify if user is able to register without filling the Radio Button
	public void testCase_10() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickingRegisterButton();
		// User is not able to see any errors but not able to register himself when not entering anything in Radio Button
	}
	
	@Test  // Test Case -11
	// Verify if user enters only Single Character both in First Name and Last Name in Registration Page  
	public void testCase_11() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterSingleCharacterInFirstNameTextField();
		registrationPage.enterSingleCharacterInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.clickingPasswordEyeIcon();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickingConfirmPasswordEyeIcon();
		registrationPage.clickOnMaleRadioButton();
		registrationPage.clickingRegisterButton();
	}
	
	@Test  // Test Case -12
	// Verify that error message should be removed if user enters the data in First Name Textfield after error is displayed 
	public void testCase_12() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.clickingFirstNameTextField();
		registrationPage.clickingRegisterButton();
		registrationPage.displayingErrorFirstNameIsRequired();
		registrationPage.enterDataInFirstNameTextfield();
	}
	
	@Test  // Test Case -13
	//    Verify that error message should be removed if user enters the data in Last Name Textfield after error is displayed 
	public void testCase_13() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.clickingLastNameTextField();
		registrationPage.clickingRegisterButton();
		registrationPage.displayingErrorLastNameIsRequired();
		registrationPage.enterDataInLastNameTextField();
	}
	
	@Test  // Test Case -14
	// Verify that error message should be removed if user enters the data in User Name Textfield after error is displayed 
	public void testCase_14 () throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.clickingUserNameTextField();
		registrationPage.clickingRegisterButton();
		registrationPage.displayingErrorUserNameIsRequired();
		registrationPage.enterDataInUserNameTextfield();
	}
	
	@Test // Test Case
	//  Verify that error message should be removed if user enters the data in Password Textfield after error is displayed 
	public void testCase_15() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.clickingPasswordField();
		registrationPage.clickingRegisterButton();
		registrationPage.displayingErrorPasswordIsRequired();
		registrationPage.enterDataInPasswordField();
	}
	
	@Test    //  Test Case-16
	//   Verify that error message should be removed if user enters the data in Confirm Password Textfield after error is displayed 
	public void testCase_16() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.clickingConfirmPasswordField();
		registrationPage.clickingRegisterButton();
		registrationPage.displayingErrorPasswordIsRequired();
		registrationPage.enterDataInConfirmPasswordField();
	}
	
	@Test  // Test Case -17
	// Verify That the Password field is encrypted 
	public void testCase_17() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInPasswordField();
		registrationPage.clickingPasswordEyeIcon();
	}
	
	@Test // Test Case -18
	// Verify That the Confirm Password field is encrypted 
	public void testCase_18() {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickingConfirmPasswordEyeIcon();
	}
	
	@Test    // Test Case -19
	//   Verify if user is able to register after selecting the female option in Radio Button Field
	public void testCase_19() {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.displayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.displayingUserRegistrationHeader());
		registrationPage.enterDataInFirstNameTextfield();
		registrationPage.enterDataInLastNameTextField();
		registrationPage.enterDataInUserNameTextfield();
		registrationPage.enterDataInPasswordField();
		registrationPage.enterDataInConfirmPasswordField();
		registrationPage.clickOnFemaleRadioButton();
	}
	
	@AfterMethod
	public void ClosingBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void initializingBrowser() throws IOException {
		initializeSession();
	}
}
