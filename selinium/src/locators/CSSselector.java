package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
 //Step 1 :
		
	   	System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
	   	
	   	//Step 2 :
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://app.hubspot.com/");

	}

}
