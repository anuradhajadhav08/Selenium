package TestNg;

import org.testng.annotations.Test;

public class Example9_Grouping1 {
	@Test(groups="login")
	public void TC1() {
	System.out.println("Passed tc1");
	}
	@Test(groups="Profile")
	public void TC2() {
		System.out.println("Passed tc2");
	}
	@Test(groups="setting")
	public void TC3() {
		System.out.println("Passed tc3");
	}

}
