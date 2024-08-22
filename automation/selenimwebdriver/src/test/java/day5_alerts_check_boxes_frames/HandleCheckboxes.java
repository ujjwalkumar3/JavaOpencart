package day5_alerts_check_boxes_frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select specific one checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total number of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes:"+checkboxes.size()); //7
		
		//Select all the checkboxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		//Select last 2 checkboxes
		// total Number of checkboxes-how many checkboxes to be selected= starting index
		//7-3= 4 ( startign index)
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select first 2 chekboxes
		
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(i<2)
			{
			checkboxes.get(i).click();
			}
		}*/
		
		//clear/Uncheck the checkboxes
		
		//Using normal for loop
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}*/
		
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		
	}

}

