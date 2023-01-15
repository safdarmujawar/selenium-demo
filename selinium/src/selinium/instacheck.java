package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class instacheck {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"D:\\selenium driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement NewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		NewAcc.click();
		Thread.sleep(3000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("irum");
		Thread.sleep(3000);
		WebElement Surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("dabir");
		Thread.sleep(3000);
		WebElement emailaddress=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailaddress.sendKeys("8796978504");
		Thread.sleep(3000);
		WebElement Newpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Newpassword.sendKeys("irumdabir");
		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select d=new Select(day);
		d.selectByIndex(18);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select d1=new Select(month);
		d1.selectByVisibleText("Oct");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select d11=new Select(year);
		d11.selectByValue("1994");
		
		WebElement e=driver.findElement(By.xpath("// *[text()='Male']"));
		WebElement SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));

		SignUp.click();
		
		
		
		
		
		 
		
		
		
		

		
		
		

	}

}
