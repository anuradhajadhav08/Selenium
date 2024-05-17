package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example8_MultiBrowserTesting {
	
	
	@Parameters("BrowserName")
	@Test
public void OpenFacebookApp(String BrowserName) throws InterruptedException {
		WebDriver driver= null;
		
		if(BrowserName.equals("Firefox")) {
			 driver= new FirefoxDriver();
		}
		else if(BrowserName.equals("Edge"))
		{
			 driver= new EdgeDriver();
		}
		else if(BrowserName.equals("Chrome"))
		{
			driver  = new ChromeDriver();
		}
		
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.close();
	
}
}
