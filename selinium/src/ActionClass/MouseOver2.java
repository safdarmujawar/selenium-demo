package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://mrbool.com/");
			
			Thread.sleep(4000);
			
			Actions act=new Actions(driver);			
		WebElement contents=driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
		    
			act.moveToElement(contents).build().perform();
			WebElement Article= driver.findElement(By.xpath("//a[contains(text(),'Articles')]"));
			String text= Article.getText();
			System.out.println(text);
	}

}
