package practicePOM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1_SwagLabs_TestPage1 {
	Example1_SwagLabs_LoginPage log;
	Example1_SwagLabs_HomePage  home;
	Example1_SwagLabs_MenuPage menu;
	Example1_SwagLabs_HomePage1 town;
	
	Sheet sh;
	
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 log = new Example1_SwagLabs_LoginPage(driver);
		 home = new Example1_SwagLabs_HomePage(driver);
		 menu = new Example1_SwagLabs_MenuPage(driver);
		 town = new Example1_SwagLabs_HomePage1(driver);
		
	}
	@BeforeMethod
public void LoginToApp() throws InterruptedException {
	log.SwagLabsLogin(sh.getRow(2).getCell(1).getStringCellValue());	
	log.SwagLabsPWD(sh.getRow(2).getCell(2).getStringCellValue());
	log.SwagLabsLoginButton();
	Thread.sleep(1000);

}
	@Test
public void VerifyAppName() throws InterruptedException {
		String ActTitle=town.VerifyTitle();
		String ExpTitle=sh.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(ActTitle, ExpTitle);
		
	//home.VerifyTitle(sh.getRow(2).getCell(0).getStringCellValue());
	Thread.sleep(1000);
	
}
	@AfterMethod
public void LogOutApp() throws InterruptedException {
	home.ClickOnAddToCart();
	Thread.sleep(1000);
	home.ClickMenuButton();
	menu.SwagLabsclickOnLogout();
	Thread.sleep(1000);
}
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
}
