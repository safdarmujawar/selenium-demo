package Assersion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assersion {
	@Test
	public void demoTest1() {
		
		Assert.assertTrue(true);
		
		System.out.println("Good evening");
		
		Assert.assertEquals("helloe", "helo");
		
		System.out.println("failed");
		
		System.out.println();
		
	}
	
	@Test
	
	public void DemoTest2() {
		
		Assert.assertTrue(true);
		
		System.out.println("good start");
		
		Assert.assertEquals("java", "java");
		
		System.out.println("passed");
	}
	

}
