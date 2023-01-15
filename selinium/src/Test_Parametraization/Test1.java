
package Test_Parametraization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({"URL"})
	public void Setup(String URL) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get(URL);	
			Thread.sleep(3000);
	}
	@Test
	@Parameters({"Username","Password", "EXP"})
	public void LoginTest(String Username, String Password, String Exp) throws InterruptedException {
		
		WebElement User1 = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(3000);
		User1.clear();
		Thread.sleep(3000);
		User1.sendKeys(Username);
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		Pass.clear();
		Thread.sleep(2000);
        Pass.sendKeys(Password);
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(7000);

		
		String Exp_Title = "Dashboard / nopCommerce administration";
		
		String Actual_Title= driver.getTitle();
		
		if(Exp_Title.equals(Actual_Title)) 
			System.out.println("Pass");
		
		else 
			System.out.println("Fail");
		
	}
	
	@AfterMethod
		public void Teardown() {
			driver.quit();
		}
		
	
}