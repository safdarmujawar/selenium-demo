package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Edge.driver","D:\\edge driv\\msedgedriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
		
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(2000);
			
			Actions act=new Actions(driver);
			
			WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
			
			act.doubleClick(doubleclick).build().perform();
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			
			WebElement rightclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
			
			act.contextClick(rightclick).build().perform();
			
			Thread.sleep(2000);
			
			driver.quit();
			

	}

}
