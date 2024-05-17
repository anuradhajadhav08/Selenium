package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example5_AssertEquals_AssertClass1 {
@Test
public void Tc1() {
	String actResult ="abc";
	String expResult="abc";
	Assert.assertEquals(actResult, expResult,"Failed: if result if different");
}
	
}

