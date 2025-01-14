package day21_Page_object_model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//using Page Factory class. Page Object class
public class LoginPage2 {
	WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		//internally initiate all the elements using driver
		PageFactory.initElements(driver,this); //MANDATORY
	}
	
	//Locators
	//we avoid findElement in  PageFactory
	
	//@FindBy(xpath="//input[@placeholder='Username']")  
	
	//so use FindBy annotation and store it in a variable 
	//identifying and locator both is included
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")  
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")  
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")  
	WebElement btn_login;
	
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
		
	//Action methods
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}

	public void clickLogin()
	{
		btn_login.click();
	}
}
