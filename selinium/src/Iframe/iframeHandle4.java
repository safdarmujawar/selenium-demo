package Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandle4 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
        WebDriver driver = new ChromeDriver();
					
		driver.manage().window().maximize();
					
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
					
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("iframeResult");
	    
	    driver.switchTo().frame(0);
	    
	    System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText());
			
	    driver.switchTo().parentFrame();
	    
	    String text =  driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
		  
	    System.out.println(text);
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();

	}

}
