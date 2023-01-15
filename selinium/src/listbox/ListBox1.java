package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("EE@123");
		
		driver.findElement(By.id("pass")).sendKeys("WEEER!@");
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sharma");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("2345678");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("15d9854");
		driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//option[@value=\"16\"]")).click();
		Thread.sleep(1500);
		//driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
		//driver.findElement(By.xpath("//option[contains(text(),\"May\")]").click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2021\"]")).click();
		Thread.sleep(1500);           
		driver.quit();

	}

}
