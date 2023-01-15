package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbusDynamicListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("PUNE");
		Thread.sleep(1500);
		
	 List<WebElement> city= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	 
	 System.out.println("total dropdown list cities:="+city.size());
	 
	 for(int i=0; i<city.size();i++) {
		 
		 System.out.println(city.get(i).getText());
		 System.out.println();
		 if(city.get(i).getText().equals("Hadapsar, Pune")) {
			 System.out.println("desired city to go:="+city.get(i).getText());
			 city.get(i).click();
			 break;
		 }
	 }
	    
	}

}
