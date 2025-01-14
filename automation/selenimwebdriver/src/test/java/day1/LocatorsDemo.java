package day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logoDisplayedstatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayedstatus);
		
		//link text & partial link text
//		driver.findElement(By.linkText("Tablets")).click();
		//so some part of text also we can pass
		driver.findElement(By.partialLinkText("Tab")).click();
		
		//classname
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println(headerLinks.size());
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> ilink = driver.findElements(By.tagName("img"));
		System.out.println(ilink.size());
	}

}
