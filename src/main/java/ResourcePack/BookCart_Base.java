package ResourcePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.BookCart_HomePage;
import PageObjects.BookCart_LoginPage;
import PageObjects.BookCart_RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookCart_Base {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static BookCart_HomePage homePage;
	public static BookCart_RegistrationPage registrationPage;
	public static BookCart_LoginPage loginPage;
	public static String Properties_File_Path = "\\src\\main\\java\\ResourcePack\\BookCart.properties";

	public WebDriver initializeBrowser() throws IOException {

		String propertiesPath = System.getProperty("user.dir") + Properties_File_Path;
		FileInputStream fis = new FileInputStream(propertiesPath);
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			PageObjects();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("URL"));

		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get(prop.getProperty("URL"));
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

	public WebDriver initializeSession() throws IOException {
		return driver = initializeBrowser();
	}

	public void PageObjects() {
		homePage = new BookCart_HomePage();
		registrationPage = new BookCart_RegistrationPage();
		loginPage = new BookCart_LoginPage();
	}

	public void waitForElementToBeVisibile(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Window Handle
	public void windowHandle01() throws InterruptedException {
		Thread.sleep(3000);
		Set<String> allWindowHandle = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<>(allWindowHandle);
		driver.switchTo().window((String) ar.get(01));
	}

	// TimeStamp
	public String TimeStamp() {
		Timestamp ts = Timestamp.from(Instant.now());
		String str = String.valueOf(ts.getTime());
		return str;
	}
}
