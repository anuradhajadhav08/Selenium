package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example5_AssertnotEquals_AssertClass2 {
	@Test
	public void Tc1() {
		String actResult ="xyz";
		String expResult="xyz";
		Assert.assertNotEquals(actResult, expResult,"Passed: if result if different");
	}
}
