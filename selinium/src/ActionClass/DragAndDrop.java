package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement source= driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		
		Thread.sleep(2000);
		
		WebElement destination= driver.findElement(By.id("box103"));
		
		Thread.sleep(2000);
		
		act.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
