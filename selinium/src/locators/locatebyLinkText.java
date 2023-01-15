package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatebyLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
           Thread.sleep(4000);
		
		driver.findElement(By.name("email")).sendKeys("Tome@123");
		
		driver.findElement(By.name("pass")).sendKeys("E1223");
		
	//	driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
