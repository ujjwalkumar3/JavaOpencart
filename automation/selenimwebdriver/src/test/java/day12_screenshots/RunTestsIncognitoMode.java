package day12_screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
			
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