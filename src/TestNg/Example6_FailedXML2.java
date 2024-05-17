package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example6_FailedXML2 {
	@Test
	public void TC4() {
	System.out.println("Passed tc4");
	}
	@Test
	public void TC5() {
		System.out.println("Passed tc5");
	}
	@Test
	public void TC6() {
		System.out.println("Passed tc6");
		String actResult="abc";
		String expResult="abc";
		
		Assert.assertEquals(actResult, expResult);
	}

}
