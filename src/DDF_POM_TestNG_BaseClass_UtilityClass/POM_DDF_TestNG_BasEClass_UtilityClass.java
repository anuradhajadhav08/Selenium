package DDF_POM_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_TestNG_BasEClass_UtilityClass {
	SwagLabLoginpage1 login;
	SwagLabHomepage home ;
	SwagLabMenupage menu ;
	WebDriver driver;
	@BeforeClass
public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	login=new SwagLabLoginpage1(driver);
	 home = new SwagLabHomepage(driver);
	 menu = new  SwagLabMenupage(driver);
	
	
}
@BeforeMethod
public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException {
	login.SwagLabLoginpageUN(UtilityClass.getTD(1, 1));
	Thread.sleep(2000);
	login.SwagLabLoginpagePWD(UtilityClass.getTD(1, 2));
	Thread.sleep(2000);
	login.SwagLabLoginpageBtn();
	Thread.sleep(2000);

}
@Test
public void ToVerifyTitle() throws EncryptedDocumentException, IOException {
	String actTile = home.getSwagLabHomePageTitle();
	String ExpTitle=UtilityClass.getTD(1, 0);
	Assert.assertEquals(actTile, ExpTitle,"Failed:both results are failed");
	
}
@AfterMethod
public void logoutFromApp() throws InterruptedException {
	home.ClickSwagLabLoginpageMenuBtn();
	Thread.sleep(2000);
	menu.SwagLabMenupageLogOut();
	Thread.sleep(2000);
	
}
@AfterClass
public void closeBrowser() {
	driver.quit();
	
}
}
