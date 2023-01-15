package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListboxWithoutSelectlass2 {
	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	    
	    Thread.sleep(1500);
	    
	    String dayXpath= "//select[@id=\"day\"]//option";
	    String monthXpath= "//select[@id=\"month\"]//option";
	    String yearXpath= "//select[@id=\"month\"]//option";
	    
	    String DOB = "19/5/1994";
	    String Date[]=DOB.split("/");
	    
	    selectdropdown(dayXpath, Date[0]);
	    selectdropdown(monthXpath, Date[1]);
	    selectdropdown(yearXpath, Date[2]);
 
	}

	private static void selectdropdown(String Xpath, String value) {
		
         List<WebElement>name=driver.findElements(By.xpath(Xpath));
		
		System.out.println(name.size());
		  
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
			if(name.get(i).getText().equals(value)){
				name.get(i).click();
}
			}
}
	}