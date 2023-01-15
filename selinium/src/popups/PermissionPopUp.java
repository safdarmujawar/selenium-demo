package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
	//	ChromeOptions options=new ChromeOptions();
		
		//options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
