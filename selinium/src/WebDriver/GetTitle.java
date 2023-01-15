package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String page= driver.getTitle();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		System.out.println(page);
		
		//driver.close();
	     driver.quit();
	}

}
