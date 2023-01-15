package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension size= new Dimension(1000, 500);
		
		Thread.sleep(2000);
		
		driver.manage().window().setSize(size);
		
		System.out.println(size);

	}

}
