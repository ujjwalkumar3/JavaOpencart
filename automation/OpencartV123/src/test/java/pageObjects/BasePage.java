package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		//contains only constructor
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
