package Scrneeshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrmentor {

	public static void main(String[] args) throws IOException  {
		
		Date currentdate= new Date();
		//System.out.println(currentdate);
		
	String Screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		
		File Screenshotfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File destination= new File("C:\\Users\\admin\\Desktop\\screenshots");
		
	FileHandler.copy(Screenshotfile, destination);
	}

}
