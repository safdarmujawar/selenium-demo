package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBackgroung {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement fblogo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.background='red'",fblogo);
		
		Thread.sleep(2000);
		
		WebElement Link =driver.findElement(By.xpath("//div[@id=\"reg_pages_msg\"]"));
		
		Thread.sleep(2000);

	    WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
    	
	    Thread.sleep(3000);
	    
	    highlight(Login, driver);
	    
	    highlight(Link, driver);
	    
	    highlight(Login, driver);
	    
	    Thread.sleep(4000);
		
		driver.quit();
		
		
}
        public static void highlight(WebElement element, WebDriver driver) {
        	
        	JavascriptExecutor js1=(JavascriptExecutor)driver;
        	
        	js1.executeScript("arguments[0].style.background='red'", element);
        	
        }

}