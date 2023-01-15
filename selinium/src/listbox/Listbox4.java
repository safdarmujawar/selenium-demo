package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	    
	    Thread.sleep(1500);
	   
	    WebElement day= driver.findElement(By.id("day"));
	    WebElement month =driver.findElement(By.id("month"));
	    WebElement year =driver.findElement(By.id("year"));
	    
	    Select selectday=new Select(day);
// Q. how can you get size of the list box of day
	    
	   List<WebElement>Listday=selectday.getOptions();
	   System.out.println("size of day list is-"+Listday.size());
	 //2. Q How will u print all the values from the list 
	   for(int i=0;i<=Listday.size();i++){
		  String dayvalues=Listday.get(i).getText();
		   System.out.println(dayvalues);
		   
     //Q 3 - How will you select specified values from list 
		   
		  if(dayvalues.equals("20")) {
			  
			  Listday.get(i).click();
			  break;
		  }
	   }
	   System.out.println("==========================================================================================");
	    Select selectmonth=new Select(month);
//Q. how can you get size of the list box of day
	    
	   List<WebElement>Listmonth=selectmonth.getOptions();
	   System.out.println("Size of month list is-"+Listmonth.size());
	 //2. Q How will u print all the values from the list 
	   for(int i=0;i<=Listmonth.size();i++){
		  String monthvalues=Listmonth.get(i).getText();
		   System.out.println(monthvalues);
		   
    //Q 3 - How will you select specified values from list 
		   
		  if(monthvalues.equals("Mar")) {
			  
			  Listmonth.get(i).click();
			  break;
	}

	   }
	}
	}
