package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Invocation1 {
	
		@Test
			public void openBrowser() throws InterruptedException {
			
				Reporter.log("Tc1 Passed",true);
				
			}
		@Test
			public void login() {
				Reporter.log("Tc2 Passed",true);
				
			}
		@Test
			public void TC5() {
				Reporter.log("Tc3 Passed",true);
				
			}
		@Test
			public void logout() {
				Reporter.log("Tc4 Passed",true);
				
		}
}
