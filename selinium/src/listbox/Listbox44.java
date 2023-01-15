package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox44 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
		
		Thread.sleep(1500);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select selectday = new Select(day);
		
		//1 Q.How will u get total number of size
		
		List<WebElement>Listday = selectday.getOptions();
		System.out.println(Listday.size());
		
		//2. Q How will u print all the values from the list
		
		for(int i=0;i<Listday.size();i++) {
			
			String dayvalues = Listday.get(i).getText();
			
			System.out.println(dayvalues);
			
	    //Q 3 - How will you select specified values from list 
			
			if(dayvalues.equals("15")) {
				Listday.get(i).click();
			    break;
			}
		}
		
		System.out.println("------------------------------------------");
		
		Select selectmonth = new Select(month);
		List<WebElement>Listmonth=selectmonth.getOptions();
		System.out.println(Listmonth.size());
		
		for(int i=0;i<Listmonth.size();i++) {
			
			String MonthValues  = Listmonth.get(i).getText();
			System.out.println(MonthValues);
			
			if(MonthValues.equals("May")) {
				Listmonth.get(i).click();
				break;
			}
		}

	}

}
