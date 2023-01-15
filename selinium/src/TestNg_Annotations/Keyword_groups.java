package TestNg_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword_groups {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
		    driver =new ChromeDriver();
		 
		    driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://kite.zerodha.com/");
	}
	
	@Test(priority=1,groups="1")
	
	public void kiteLoginPageTitle() {
		
		String Title= driver.getTitle();
		
		System.out.println(Title);
		
	}
	
	@Test(priority=2,groups="1")
	public void kitelogoTest() {
		
		boolean b=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
	    
		System.out.println(b);
	}
	
	@Test(priority=3,groups="1")
	public void Forgetuserlink() {
		
		String b=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).getText();
		System.out.println(b);
	}
	
	@Test(priority=4,groups="2")
	
	public void m1() {
		
		System.out.println("group2");
	}
	
@Test(priority=5,groups="2")
	
	public void m2() {
		
		System.out.println("group2");
	}

@Test(priority=6,groups="3")

public void m3() {
	
	System.out.println("group3");
}

@Test(priority=7,groups="3")

public void m4() {
	
	System.out.println("group3");
}
	
	@AfterMethod   //3  6  9
	public void Teardown() {		
		
		driver.quit();
	}

}


