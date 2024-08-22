package day4_navigate;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//closing multiple browser windows
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			//String url=driver.switchTo().window(winid).getCurrentUrl();
			
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title"))
			{
				driver.close();
			}
			
//			if(title.equals("Human Resources Management Software | OrangeHRM"))
//			{
//				driver.close();
//				break; //close one and quit
//			}
			
		}
	}

}