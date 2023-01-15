package TestNg_Annotations;

import org.testng.annotations.Test;

public class Keyword_dependson {
	
	@Test
	
	public void m1() {
		
		int i=10/0;
		System.out.println(i);
	}
	
	@Test(dependsOnMethods="m1")
	public void m2() {
		
		System.out.println("search method");
	}
    
	@Test
	
	public void M3() {
		
		System.out.println("display method");
	}
}
