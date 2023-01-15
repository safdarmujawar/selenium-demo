package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Point p=new Point(700, 800);
		
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(2000);
		
		driver.quit();
	}

}
