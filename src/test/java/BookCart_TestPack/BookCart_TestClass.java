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
//		registrationPage.ClickingRegisterButton();
		Thread.sleep(3000);
	}
	@Test  // Test Case -3
	public void TestCase_3() throws InterruptedException {
		
		//user now navigated to Login Page
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.EnteringDataInUsernameField();
		loginPage.EnteringDataInPasswordField();
		loginPage.ClickingLoginButton();
		Thread.sleep(3000);
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
	Thread.sleep(3000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
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
		// Password & Confirm Password Appears in Red Color
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void ClosingBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void initializingBrowser() throws IOException {
		initializeSession();
	}
	
//	@BeforeTest
//	public void RoutrToRegistrationPage() {
//		homePage.clickingLoginButton();
//		Assert.assertTrue(loginPage.DisplayingLoginLogo());
//		loginPage.clickingRegisterButton();
//		Assert.assertTrue(registrationPage.DisplayingUserRegistrationHeader());
//	}
}
