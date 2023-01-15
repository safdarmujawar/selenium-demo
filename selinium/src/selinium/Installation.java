package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Installation {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
