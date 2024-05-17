package TestNg;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example5_SoftAssert {
	@Test
public void TC1() {
	SoftAssert soft = new SoftAssert();
	
	String actResult ="abc";
	String expResult="xyz";
	soft.assertEquals(actResult, expResult,"Failed1: if result if different");

	
	
	boolean actresult1=false;
	soft.assertTrue(actresult1,"failed2: Result is true");

	

	
	soft.assertAll();
	
}
}
