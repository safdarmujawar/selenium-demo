package DataPickers;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
			
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.redbus.in/");
	        
			driver.findElement(By.id("src")).sendKeys("Pune");
			Thread.sleep(3000);
			
//		    List<WebElement>City =driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));	
//		    System.out.println("Total count :"+City.size());
//		    
		    String date ="20";
		    String month ="Oct";
		    String years ="2022";
		    
		    driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		    
		    while(true) {
		    	
		    	String Monthyear=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
		    	
		    	String []arr= Monthyear.split(" ");
		    	String mon=arr[0];
		    	String yea =arr[1];
		    	
		    	if(mon.equalsIgnoreCase(month)&& yea.equals(years)) 
		    		break;
		    	else
		    		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
		    }
		       
		 List<WebElement>Alldates=  driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));

		 for(WebElement ele:Alldates) {
			 
			 String dt=ele.getText();
			 
			 if(dt.equals(date)) {
				 ele.click();
				 break;
			 }
		 }
	}

}
