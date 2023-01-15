package MultipleLinksHandeling;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		int brokenlink=0;
		
		for(WebElement element:links) {
			
			String url= element.getAttribute("href");
			
			if(url==null||url.isEmpty()) {
				
				System.out.println("URL is NULL or empty");
				continue;
			}
			
			URL link= new URL(url);
			
			HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				
				System.out.println(httpcode.getResponseCode()+"---->"+url+"is ---->"+"Broken Links");
				
				brokenlink++;  //1 2 3 4
			}
			else {
				System.out.println(httpcode.getResponseCode()+"--->"+url+"is ----->"+"Valid Links");
			}
			
           
		}
		
		 System.out.println("Number of broken links : "+brokenlink);
			
			driver.quit();

	}

}
