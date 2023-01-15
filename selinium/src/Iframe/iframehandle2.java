package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandle2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.automationtesting.in/Frames.html");
	    Thread.sleep(4000);
		driver.manage().window().maximize();
         Thread.sleep(3000);
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
	}

}
