package MultipleLinksHandeling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//find all links use anchor tag in xpath
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("total links present"+ links.size());
		
		//print all links
		
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			
			driver.quit();
		}

	}

}
