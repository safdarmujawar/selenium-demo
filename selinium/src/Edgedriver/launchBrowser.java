package Edgedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\selinium\\test-output\\resources\\geckodriver.exe");    
       WebDriver driver = new FirefoxDriver();
       
       System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selinium\\test-output\\resources\\chromedriver.exe");
		
      // WebDriver	driver=new ChromeDriver();
		
        driver.get("https://www.facebook.com/");
	}
	

}
