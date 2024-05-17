package practice_POM_DDF_TestNG_Base_Utility_Failed_Property;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	public void IntializeBrowser() throws EncryptedDocumentException, IOException {
   driver = new ChromeDriver();
   driver.manage().window().maximize();
	driver.get(UtilityClass.getDataFromPropertyFile("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 }	
}
