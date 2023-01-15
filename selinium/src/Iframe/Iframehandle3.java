package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		Thread.sleep(3000);
		
		WebElement Outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
		driver.switchTo().frame(Outerframe);
		
		WebElement innerframe =driver.findElement(By.xpath("html/body/section/div/div/iframe"));
					
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();

	}

}
