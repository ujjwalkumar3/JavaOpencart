package day21_Page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//create Page Object Class
public class LoginPage {
	//3 things needed for any page object class->constructor,locators list, action methods
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		//to initiate the driver
		this.driver=driver;
	}
	
	//Locators
	By txt_username_loc=By.xpath("//input[@placeholder='Username']"); //locator return By type
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	
	//Action methods
	//for every locator create specific action methods
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	
}
