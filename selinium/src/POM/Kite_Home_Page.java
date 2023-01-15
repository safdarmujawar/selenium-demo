package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {
	
	//1
		@FindBy(xpath = "//span[contains(text(),'GP8097')]")
		
		WebElement UserID;
		
		//2
		public Kite_Home_Page(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}	
		//3
		public void UserID1() {
			
			String ExpectedUserID  = "GP8097";
			
			String ActulaUSerID =UserID.getText();
			
			if(ExpectedUserID.equals(ActulaUSerID)) {
				
				System.out.println("Valid UserID");
			}
			else
				
				System.out.println("Invalid UserID");
		}

}
