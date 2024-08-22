package day12_screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		//create options object for Chrome
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");  // setting for headless mode of execution
		
			
		WebDriver driver=new ChromeDriver(options); 
			       
		driver.get("https://demo.opencart.com/");
				
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
		driver.quit();
		
		
	}

	
}