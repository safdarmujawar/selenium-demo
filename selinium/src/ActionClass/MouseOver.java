package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
		Actions act=new Actions(driver);
		 //WebElement  Login=  driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		  WebElement More=driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));
         act.moveToElement(More).build().perform();
	}

}
