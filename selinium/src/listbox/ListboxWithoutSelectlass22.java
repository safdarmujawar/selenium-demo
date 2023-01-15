package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListboxWithoutSelectlass22 {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		
		//Step 2 :
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		
		Thread.sleep(3000);
		
	      String DayXpath ="//select[@id=\"day\"]//option";
          String MonthXpath ="//select[@id=\"month\"]//option";
          String Yearxpath ="//select[@id=\"year\"]//option";
          
          String dob ="14/5/2020";
          String date[]=dob.split("/");

          selectdropdown(DayXpath, date[0]);
          selectdropdown(MonthXpath, date[1]);
          selectdropdown(Yearxpath, date[2]);
          
	}

	public static void selectdropdown(String xpath, String value) {

		List<WebElement>name=driver.findElements(By.xpath(xpath));
		
		System.out.println(name.size());
		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
			if(name.get(i).getText().equals(value)) {
				name.get(i).click();
			}
		}
		

	}

}
