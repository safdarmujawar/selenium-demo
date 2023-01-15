package TestNg_Annotations;

import org.testng.annotations.Test;

public class Keyword_InvocationCount {
	
	@Test(invocationCount=5)
	
	public void m1() {
		
		int a=20;
		int b=30;
		int c=a+b;
		
		System.out.println(c);
	}

}
