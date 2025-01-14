package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
		
		//xpath with multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Shirts");
		
		//xpath with and operator
		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Mobile");
		
		//xpath with or operator
		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Laptop");
		
		//xpath with inner text -> text()
		driver.findElement(By.xpath("//a[text()='Software']")).click();
		
		//text() can be written with . also
		boolean displaystatus = driver.findElement(By.xpath("//h3[.='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String ele = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(ele);
		
		//chained xpath, // ignores all and give desired, / go step ny step like tree
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
	}

}
