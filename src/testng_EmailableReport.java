import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng_EmailableReport {
@Test
	public void TC1() {
	Reporter.log("....TC1 Passed....", true);
		
	}
@Test
	
	public void TC2() {
	Reporter.log("....TC2 Passed....", true);	
	}
@Test
	public void TC3() {
	Reporter.log("....TC3 Passed....", true);
		
	}
}
