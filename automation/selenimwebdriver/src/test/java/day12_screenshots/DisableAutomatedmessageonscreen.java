package day12_screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessageonscreen {

	public static void main(String[] args) {
		//to remove chrome is being control by automated software
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			
		WebDriver driver=new ChromeDriver(options); 
			       
		driver.get("https://swiggy.com");
				
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		if(act_title.equals("Order Food Online from India's Best Food Delivery Service | Swiggy"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
		//driver.quit();
		
		
	}

	
}