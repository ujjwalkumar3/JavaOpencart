package day6_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//If Select tag present
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//select option from the drop down
		
		//drpCountry.selectByVisibleText("France"); //inner text pass in this function
		//drpCountry.selectByValue("japan"); //value attribute pass in this function
		//drpCountry.selectByIndex(2); //index
		
		//capture the options from the dropdown
		
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size()); //10
		
		//printing the options
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		*/
		
		//enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());	
		}
		
		
	}

}