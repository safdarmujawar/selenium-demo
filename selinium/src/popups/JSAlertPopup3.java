package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopup3 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
					
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains (text(),'Click for JS Prompt')]")).click();
		Thread.sleep(2000);
		
		Alert text=driver.switchTo().alert();
		System.out.println("Alert message :"+text.getText());
		 text.sendKeys("welcome");
		 Thread.sleep(2000);
		text.accept();
		 Thread.sleep(5000);
		driver.quit();

	}

}
