package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifframedemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement TryItbtn=driver.findElement(By.xpath("/html/body/button"));
		TryItbtn.click();
		Thread.sleep(3000);
		
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
		String x=a.getText();
		System.out.print(x);
		Thread.sleep(3000);
		
		a.accept();
		
		
		
	}

}
