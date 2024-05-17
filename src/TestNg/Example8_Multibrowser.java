package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example8_Multibrowser {
	@Parameters("browserName")
	@Test
	public void OPenFacebookApp(String browserName ) throws InterruptedException {
		WebDriver driver = null;
		
		if(browserName.equals("Firefox")) {
			 driver= new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			 driver= new EdgeDriver();
		}
		else if(browserName.equals("Chrome"))
		{
			driver  = new ChromeDriver();
		}
		
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.close();
	}
}
