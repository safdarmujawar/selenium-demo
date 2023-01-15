package crossbrowser;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestin {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@Test
	
	public void loginTest(String browser) throws InterruptedException {
		
		if(browser.equals("gecko")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\selinium\\test-output\\resources\\geckodriver.exe");    
		        driver = new FirefoxDriver();
		}
		
		else if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
     	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		
		String Exp_name = "Panama Collings";
	    String Actual_name=driver.findElement(By.xpath("//p[contains(text(),'Panama Collings')]")).getText();
		
		if(Actual_name.equals(Exp_name)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
			
	    driver.quit();
	}
		
	}


