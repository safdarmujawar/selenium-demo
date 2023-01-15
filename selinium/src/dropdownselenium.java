import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownselenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","D:\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement NewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		NewAcc.click();
		Thread.sleep(3000);
		
		
		WebElement day=driver.findElement(By.xpath("//select[id='day']"));
		Select d=new Select(day);
		d.selectByIndex(20);
		driver.findElement(By.xpath("//select[id='month']"));
		d.selectByVisibleText("Oct");
		driver.findElement(By.xpath("//select[id='year']"));
		d.selectByIndex(1995);

	}

}
