package Scrneeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Scr1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//1. Full page screenshot
		
		System.setProperty("webdriver.gecko.driver", "D:\\gecko\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		//Take screenshot & copy it into source
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File destination = new File("C:\\Users\\admin\\Desktop\\screenshots");
		
		FileHandler.copy(source, destination);
		
	}

}
