package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_InnvocationCount {
@Test
	public void openBrowser() throws InterruptedException {
	
		Reporter.log(" openBrowser Passed",true);
		
	}
@Test
	public void login() throws InterruptedException {
		Reporter.log("login Passed",true);
	
		
	}
@Test
	public void TC3() {
		Reporter.log("Tc3 Passed",true);
		
	}
@Test
	public void logout() {
		Reporter.log("logout Passed",true);
		
	}
}
