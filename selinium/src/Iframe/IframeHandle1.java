package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(4000);
		
		// To switch main page to iframe using frame name
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		//switching back from the iframe
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
			
		Thread.sleep(4000);
				
		driver.quit();
		
	}

}
