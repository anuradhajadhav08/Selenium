package DDF_POM_TestNG_Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTestPage extends Baseclass{
	SwagLabsLoginPage s1;
	SwagLabsHomePage s2;
	SwagLabsMenuPage s3;
	String acttitle;
	
	@BeforeClass
	public void OPenBrowser() throws IOException
	{
		IntializeBrowser();
		 s1= new SwagLabsLoginPage(driver);
		 s2 = new SwagLabsHomePage(driver);
		 s3 = new SwagLabsMenuPage(driver);
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		s1.EnterUN(UtilityClass.getTD(1, 1));
		Thread.sleep(2000);
		s1.EnterPassword(UtilityClass.getTD(1, 2));
		s1.ClickOnButton();
	}
	@Test
	public void VerifyTitle() throws EncryptedDocumentException, IOException, InterruptedException {
		 String acttitle = s2.VerifyHomePageTitle();
		 String Exptitle=UtilityClass.getTD(1, 0);
		 Assert.assertEquals(acttitle, Exptitle);
		 Thread.sleep(2000);
		 
	 String actual = s2.ToVerifyPN(Exptitle);
	 String Expected=UtilityClass.getTD(1, 4);
			 Thread.sleep(2000);
		 
	}
	@AfterMethod
	public void LOgoutFromApp() {
		s2.ClickOnMenuButton();
		s3.ClickOnLogout();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
