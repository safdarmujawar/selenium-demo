package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(4000);
		
		Kite_login_page1 kp1= new Kite_login_page1(driver);
		
		kp1.UserID();
		
		Thread.sleep(2000);
		
		kp1.Password();
		
		Thread.sleep(2000);
		
		kp1.Loginbutton();
		
		Kite_login_page2 kp2 =new Kite_login_page2(driver);
		
		Thread.sleep(2000);
		
		kp2.UserPIN();
		
		Thread.sleep(4000);
		
		kp2.PINButton();
		
		Thread.sleep(2000);
		
        Kite_Home_Page KH =new Kite_Home_Page(driver);
		
		KH.UserID1();

	}

}
