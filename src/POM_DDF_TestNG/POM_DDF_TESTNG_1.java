package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Framework.SwagLabsHomePage_1;
import Framework.SwagLabsLoginPagee_1;
import Framework.SwagLabsMenuPage_1;

public class POM_DDF_TESTNG_1 extends BaseClass {
Sheet sh;
	
	SwagLabsLoginPage login;
	SwagLabsHomePage1 home;
	//SwagLabsMenuPage menu;
	@BeforeClass
public void OpenBrowser() throws EncryptedDocumentException, IOException {


		 BrowserOpen();
		 
		login= new SwagLabsLoginPage(driver);
		 home =  new SwagLabsHomePage1(driver);
		 //menu = new SwagLabsMenuPage(driver);
		
	
}
	@BeforeMethod
public void LoginToPage() throws InterruptedException, EncryptedDocumentException, IOException {
	login.SwagLabsLoginPageUN(UtilityClass.getTD(2, 1));
	Thread.sleep(2000);
	login.SwagLabsLoginPagePWD(UtilityClass.getTD(2, 2));
	Thread.sleep(2000);
	login.SwagLabsLoginPageButton();
	
}
	@Test
public void VerifyTitle() throws InterruptedException, EncryptedDocumentException, IOException {
		home.SwagLabsYourcartProductName(UtilityClass.getTD(2, 4));
		Thread.sleep(2000);
	
}
	@AfterMethod
public void LogoutFromPage() {
		home.ClickOnProduct();
		
	
}
	@AfterClass
public void ClosedBrowser() {
	driver.close();
}

}


