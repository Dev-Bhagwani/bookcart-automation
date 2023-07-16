package BookCart_TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ResourcePack.BookCart_Base;

public class BookCart_TestClass extends BookCart_Base {
	
	@Test
public void BookCartRegister() throws IOException, InterruptedException{
		
		// HomePage
		Assert.assertTrue(homePage.DisplayingHomeCartLogo());
		homePage.clickingLoginButton();
		
		//Login Page
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
		
	}
	@Test
	public void TestCase_3() throws InterruptedException {
		
		//user now navigated to Login Page
		homePage.clickingLoginButton();
		Assert.assertTrue(loginPage.DisplayingLoginLogo());
		loginPage.EnteringDataInUsernameField();
		loginPage.EnteringDataInPasswordField();
		loginPage.ClickingLoginButton();
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
