package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page1 {
	
	//POM -1
	
	// Data member/global variables should be declared globally with access level private by 
		//using @Findby
	
	@FindBy(xpath="//input[@id=\"userid\"]")
	
	private WebElement LoginID;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement LoginButton;
	
	//initialize within constructor with access level public
	
	public Kite_login_page1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void UserID() {
		
	LoginID.sendKeys("GP8097");
	}
	
	public void Password() {
		
		password.sendKeys("gms@0110");
	}
	
	public void Loginbutton() {
		
		LoginButton.click();
		
	}

}
