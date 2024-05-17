package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example9_Grouping2 {
	@Test(groups="setting")

	public void TC4() {
	System.out.println("Passed tc4");
	}
	@Test(groups="login")

	public void TC5() {
		System.out.println("Passed tc5");
	}
	@Test(groups="setting")

	public void TC6() {
		System.out.println("Passed tc6");
		String actResult="abc";
		String expResult="abc";
		
		Assert.assertEquals(actResult, expResult);
	}

}
