package Parallel_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	
	
	public void module1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	@Test
            public void module2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
}
	
	@Test
     public void module3() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(3000);
	
	driver.quit();
}
}