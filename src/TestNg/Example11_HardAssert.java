package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11_HardAssert {
	@Test
public void VerifyName() {
	
	String num="ABC";
	String num1="ADC";
	Assert.assertNotEquals(num, num1, "failed: both the result are same:-");
	 }
}
