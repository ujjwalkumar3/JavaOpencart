package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//1) launch browser
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2)open url
		driver.get("https://demo.opencart.com/");
		
		//3)validate title
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//4)close browser
		driver.close();
//		driver.quit();
		
	}

}
