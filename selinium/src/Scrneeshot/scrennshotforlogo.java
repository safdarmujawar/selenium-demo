package Scrneeshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class scrennshotforlogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[1]/h1/a/img"));
		Thread.sleep(2000);
		
		File Source =((TakesScreenshot)src).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		String Random= RandomString.make(3);
		String filename= "Facebook";
		
		File Destination=new File("C:\\Users\\admin\\Desktop\\screenshots"+ filename + Random);
		
		FileHandler.copy(Source, Destination);
		
		

	}

}
