package day5_alerts_check_boxes_frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//directly we can't handle this using alert or get so pass username and password and with browser only it can perform
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//syntax
		//http://username:password@the-internet.herokuapp.com/basic_auth
			
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
	}

}

