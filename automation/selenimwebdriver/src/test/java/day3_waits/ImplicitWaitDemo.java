package day3_waits;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//waiting for the time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit dynamic
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}

