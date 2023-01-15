package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttributes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("cbsc@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Tom@gmail.com");
		Thread.sleep(1500); 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234565");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(1500);
        driver.close();  
        
	}

}
