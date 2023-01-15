package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page2 {
	
	//Step1=// Data member/global variables should be declared globally with access level private by 
	//using @Findby
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	
	WebElement PIN;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	
	WebElement ContineButton;
	
	//Step2=//initialize with constructor with access level public
	
	public Kite_login_page2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}
	
	//Step3= declare methods
			
			 //3
			
			public void UserPIN() {
				PIN.sendKeys("111000");
			}
			
			public void PINButton() {
				ContineButton.click();
			}
		             
		
}
