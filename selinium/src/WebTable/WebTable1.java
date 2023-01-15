package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\selenium driver\\chromedriver.exe");
			
		    WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			Thread.sleep(4000);
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			WebElement code = driver.findElement(By.xpath("(//h3[contains(text(),'Example')])[1]"));
			
			Thread.sleep(4000);
			
			js.executeScript("arguments[0].scrollIntoView();", code);
			
			//first way to find total rows in table
			
			int row= driver.findElements(By.xpath("(//table[@id=\"customers\"]/tbody/tr)")).size();
			
			System.out.println("total number of rows-:"+ row);
			
			//how to find total number of columns in table
			
            int column= driver.findElements(By.xpath("(//table[@id=\"customers\"]/tbody/tr/th)")).size();
			
			System.out.println("total number of columns-:"+ column);
			
			//how to retrive specific row column data
			
			String Value= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[3]")).getText();
			
			System.out.println(Value);
			
			//how to read all data from table
			
			for(int i=2; i<=row; i++) {
				
				for(int j=1; j<=column; j++) {
					
					String allTableData= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
					
					// We can not pass the variables inside the xpath hence concatination +_+ is given
		    	       System.out.print(allTableData+"=//=");
		   
				}
				
				System.out.println();
			}
				
			
			
	

	}

}
