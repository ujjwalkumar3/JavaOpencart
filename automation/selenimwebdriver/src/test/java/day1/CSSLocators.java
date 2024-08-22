package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(50000);
		
		//tag id tag#id tag is optional
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Tshirts");
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Tshirts");
	}
	

}
