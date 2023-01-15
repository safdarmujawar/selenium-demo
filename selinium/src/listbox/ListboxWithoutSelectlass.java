package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListboxWithoutSelectlass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	    
	    Thread.sleep(1500);
	    
	    List<WebElement>Listday=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
	    System.out.println("size of day list box is= "+Listday.size());
	    
	    for(int i=0;i<=Listday.size();i++) {
	    	
	   System.out.println(Listday.get(i).getText());
	   
	  if(Listday.get(i).getText().equals("19")){
		   
		  Listday.get(i).click();
		  break;
	   }
	    }
		List<WebElement> MonthList = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		System.out.println("Size of month listbox is="+MonthList.size());
		
		for(int i=0;i<MonthList.size();i++) {
			System.out.println(MonthList.get(i).getText());
			
			if(MonthList.get(i).getText().equals("Oct")) {
				MonthList.get(i).click();
				break;
	}

}
		List<WebElement> Yearlist = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println("Size of year listbox is="+Yearlist.size());
		
		for(int i=0;i<Yearlist.size();i++) {
			System.out.println(Yearlist.get(i).getText());
			
			if(Yearlist.get(i).getText().equals("1994")) {
				Yearlist.get(i).click();
				break;
				
				
			}}
		//driver.close();
}}