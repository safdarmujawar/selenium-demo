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

import net.bytebuddy.utility.RandomString;

public class scr3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 //1. Full page screenshot	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		//Step 2 :
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.facebook.com/");
 		
       // driver.get("https://www.redbus.in/");
	    
		Thread.sleep(3000);
		
		//Take screenshot & copy it into source
		
		WebElement src = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String random = RandomString.make(3);
		
		//String filename ="Redbus";
		
		String filename ="Facebook";
		System.out.println(Source);
		
		File destination = new File("C:\\Users\\admin\\Desktop\\screenshots"+filename+""+random+".jpg");
		FileHandler.copy(Source, destination);
	}

}
