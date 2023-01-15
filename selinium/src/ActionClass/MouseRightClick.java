package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		    
		    System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
		    WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
			Thread.sleep(2000);
			
			Actions act= new Actions(driver);
			
			WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
			
			Thread.sleep(2000);
			
			act.contextClick(button).build().perform();
			
			 driver.findElement(By.xpath("(//span[contains(text(),'Paste')])[2]")).click();
			Thread.sleep(2000);
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(5000);
			
			//driver.quit();

	}

}
