package BookCart_TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ResourcePack.BookCart_Base;

public class BookCart_TestClass extends BookCart_Base {
	
	@Test  // test case 1-2
public void BookCartRegister() throws IOException, InterruptedException{
		
		// HomePage
		Assert.assertTrue(homePage.DisplayingHomeCartLogo());
		homePage.clickingLoginButton();
		
//		//Login Page
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		Assert.assertTrue(loginPage.DisplayingRegisterButton());
		loginPage.clickingRegisterButton();
		
		//Registrating Page
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.ClickingEyeButton1();
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingEyeButton2();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
	}
	@Test  // Test Case -3
	public void TestCase_3() throws InterruptedException {
		
		//user now navigated to Login Page
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.EnteringDataInUsernameField();
		loginPage.EnteringDataInPasswordField();
		loginPage.ClickingLoginButton();
	}
	
	@Test  //Test Case -4
	// "Verify that Registration page shows alert message i.e. (User Name is not available) when entering the Existing Username 
	public void TestCase_4() throws InterruptedException {
	homePage.clickingLoginButton();
	Assert.assertTrue(loginPage.DisplayingLoginLogo());
	loginPage.clickingRegisterButton();
	Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
	registrationPage.EnteringDataInUserNameTextfield();
	registrationPage.ClickingRegisterButton();
	Assert.assertTrue(registrationPage.DisplayingUserNameIsNotAvailable());
	}
	
	@Test   // Test Case -5
	// Verify if user is able to register  without entering  First Name
	public void TestCase_5() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
		// First Name appears in red color
	}
	
	@Test   // Test Case-6
	//  Verify if user is able to register  without entering  Last Name
	public void TestCase_6() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
		// Last Name Appears in Red Color
	}	
	
	@Test  // Test Case -7
	// Verify if user is able to register  without entering Password & Confirm Password
	public void TestCase_7() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
		// Password & Confirm Password Appears in Red Color
	}
	
	@Test  // Test Case -8
	// Verify if user is able to register  without entering the correct criteria for the Password 
	public void TestCase_8() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringWrongCriteriaInPassowrdField();
		registrationPage.EnterWrongCriteriaInConfirmPasswordField();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingCriteriaErrorTextInPasswordField());
	}
	
	@Test // Test Case -9
	//  Verify if user is able to register  by entering the wrong password  in Confrim Password Box
	public void TestCase_9() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.EnterWrongCriteriaInConfirmPasswordField();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingErrorInConfirmPasswordField());
	}
	
	@Test  // Test Case -10
	// Verify if user is able to register   without filling the Radio Button
	public void TestCase_10() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInFirstNameTextfield();
		registrationPage.EnteringDataInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingRegisterButton();
		// User is not able to see any errors but not able to register himself when not entering anything in Radio Button
	}
	
	@Test  // Test Case -11
	// Verify if user enters only Single Character both in First Name and Last Name in Registration Page  
	public void TestCase_11() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringSingleCharacterInFirstNameTextField();
		registrationPage.EnteringSingleCharacterInLastNameTextField();
		registrationPage.EnteringDataInUserNameTextfield();
		registrationPage.EnteringDataInPasswordField();
		registrationPage.ClickingEyeButton1();
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingEyeButton2();
		registrationPage.ClickingGenderRadioButton();
		registrationPage.ClickingRegisterButton();
	}
	
	@Test  // Test Case -12
	// Verify that error message should be removed if user enters the data in First Name Textfield after error is displayed 
	public void TestCase_12() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.ClickingFirstNameTextField();
		registrationPage.ClickingRegisterButton();
		registrationPage.DisplayingErrorFirstNameIsRequired();
		registrationPage.EnteringDataInFirstNameTextfield();
	}
	
	@Test  // Test Case -13
	//    Verify that error message should be removed if user enters the data in Last Name Textfield after error is displayed 
	public void TestCase_13() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.ClickingLastNameTextField();
		registrationPage.ClickingRegisterButton();
		registrationPage.DisplayingErrorLastNameIsRequired();
		registrationPage.EnteringDataInLastNameTextField();
	}
	
	@Test  // Test Case -14
	// Verify that error message should be removed if user enters the data in User Name Textfield after error is displayed 
	public void TestCase_14 () throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.ClickingUserNameTextField();
		registrationPage.ClickingRegisterButton();
		registrationPage.DisplayingErrorUserNameIsRequired();
		registrationPage.EnteringDataInUserNameTextfield();
	}
	
	@Test // Test Case
	//  Verify that error message should be removed if user enters the data in Password Textfield after error is displayed 
	public void TestCase_15() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.ClickingPasswordField();
		registrationPage.ClickingRegisterButton();
		registrationPage.DisplayingErrorPasswordIsRequired();
		registrationPage.EnteringDataInPasswordField();
	}
	
	@Test    //  Test Case-16
	//   Verify that error message should be removed if user enters the data in Confirm Password Textfield after error is displayed 
	public void TestCase_16() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.ClickingConfirmPasswordField();
		registrationPage.ClickingRegisterButton();
		registrationPage.DisplayingErrorPasswordIsRequired();
		registrationPage.EnteringDataInConfirmPasswordField();
	}
	
	@Test  // Test Case -17
	// Verify That the Password field is encrypted 
	public void TestCase_17() throws InterruptedException {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInPasswordField();
		registrationPage.ClickingEyeButton1();
	}
	
	@Test // Test Case -18
	// Verify That the Confirm Password field is encrypted 
	public void TestCase_18() {
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.clickingRegisterButton();
		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
		registrationPage.EnteringDataInConfirmPasswordField();
		registrationPage.ClickingEyeButton2();
		
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
