package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(4000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		  
	    WebElement sign=driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
	    
	    Thread.sleep(4000);
		
		js.executeScript("arguments[0].scrollIntoView();", sign);
        

	}

}
