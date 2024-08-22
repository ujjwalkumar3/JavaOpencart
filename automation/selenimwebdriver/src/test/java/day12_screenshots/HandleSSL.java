package day12_screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true); // accepts SSL certificates
		
//		WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("title of the page:"+driver.getTitle()); //Privacy error
																	//expired.badssl.com
				
	}

}
