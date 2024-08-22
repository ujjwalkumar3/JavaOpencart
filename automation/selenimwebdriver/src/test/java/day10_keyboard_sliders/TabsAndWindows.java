package day10_keyboard_sliders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//Selenium4.x
		//to open other url in other tab
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		//to open other url in other window and focus is also on other url
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://orangehrm.com/");
		
	}

}
