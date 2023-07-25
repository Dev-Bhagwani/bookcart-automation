package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ResourcePack.BookCart_Base;

public class BookCart_HomePage extends BookCart_Base{
	
	public BookCart_HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static By bookCartLogo = By.xpath("//div[@class='brand-title']");
	
	public String displayingHomeCartLogo() {
		 return driver.findElement(bookCartLogo).getText();
	}
}
