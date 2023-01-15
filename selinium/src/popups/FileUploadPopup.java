package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\admin\\Downloads\\DELETE  MISMATCH  ONT KAVATHEMAHANKAL.xlsx");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
		Thread.sleep(3000);
	
		driver.quit();
	}

}
