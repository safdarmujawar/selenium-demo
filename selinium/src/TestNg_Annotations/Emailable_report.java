package TestNg_Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {
	
	@Test
	public void GoogleTitle() {
		
		System.out.println("@Test--Google Title Test ");
		Reporter.log("Running Testcase1");
		
	}
	
	@Test
	public void SearchTest() {
		Reporter.log("Running testcases 1");
		System.out.println("@Test -- Searfch Text");
		
	}

}
