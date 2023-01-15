package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_without_TestNG {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://kite.zerodha.com/");

	}

}
