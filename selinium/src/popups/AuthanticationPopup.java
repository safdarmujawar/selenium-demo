package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthanticationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
						
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/basic_auth");
			Thread.sleep(2000);
			
			//syntax 
            //https://username:password@url
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			String Text=driver.findElement(By.xpath("//p")).getText();
			System.out.println(Text);
			
			driver.quit();
	}

}
