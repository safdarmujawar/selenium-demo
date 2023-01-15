package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kite_with_TestNG {
	
	@Test
	
	public void m1() {
		
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
		 WebDriver driver =new ChromeDriver();
			
		 driver.get("https://kite.zerodha.com/");
		
	}
	@Test
	public void m2() {	
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");			
			
	     WebDriver driver = new ChromeDriver();					
	  
	     driver.get("https://kite.zerodha.com/");
	}                   

}
