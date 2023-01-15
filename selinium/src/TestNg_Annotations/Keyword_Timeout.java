package TestNg_Annotations;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Keyword_Timeout {
	
	@Test(timeOut=5000)
	
	public void InfiniteLoop() {
		
		for(;;) {
			
			System.out.println("infinite loop");
			
		}
	
	}

}
