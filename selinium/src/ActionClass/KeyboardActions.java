package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		   
		    System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
		    WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://text-compare.com/");
			
			Thread.sleep(2000);
			
			WebElement input1= driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
			
			Thread.sleep(2000);
			
			input1.sendKeys("Keyboard actions");
			
			WebElement input2 =   driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
			
			Actions act= new Actions(driver);
			
			//Control A = select all
			act.keyDown(Keys.COMMAND);
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.COMMAND);
			act.build().perform();
			
			//control C= copy
			act.keyDown(Keys.COMMAND);
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.COMMAND);
			act.build().perform();
			
			//tab used to switch text box
			
			act.sendKeys(Keys.TAB);
			act.build().perform();
			
			//Control v= paste operation
			act.keyDown(Keys.COMMAND);
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.COMMAND);
			act.build().perform();
			
			if(input1.getAttribute("value").equals(input2.getAttribute("value"))) 
			System.out.println("ok passed");
				
			
			else
				System.out.println("failed");

	}

}
