package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
	   	
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		//Step 2 :
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		
		Thread.sleep(5000);
		
		WebElement day =  driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		
		//1. Select by visibletext(String text)
//		Select Select1 = new Select(day);
//		Select1.selectByVisibleText("10");
//		
//		Select Select2 = new Select(Month);
//		Select2.selectByVisibleText("Jan");
//		
//		Select Select3 = new Select(Year);
//		Select3.selectByVisibleText("1998");
		
		
		//2. Slect byvalue
		
//		Select Select4 = new Select(day);
//		Select4.selectByValue("9");
//		
//		Select Select5 = new Select(Month);
//		Select5.selectByValue("5");
//		
//		Select Select6 = new Select(Year);
//		Select6.selectByValue("1990");
		
		
		//3. Select byindex
		
		Select Select7 = new Select(day);
		Select7.selectByIndex(4);
		
		Select Select8 = new Select(Month);
		Select8.selectByIndex(5);
		
		Select Select9 = new Select(Year);
		Select9.selectByIndex(35);
	}

}
