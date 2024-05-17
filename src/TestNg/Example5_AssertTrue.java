package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example5_AssertTrue {
	@Test
public void tc1() {
	boolean actResult=true;
	Assert.assertTrue(actResult);
}
	@Test
	public void tc2() {
		boolean actResult=false;
		Assert.assertFalse(actResult);
		
	}
}
