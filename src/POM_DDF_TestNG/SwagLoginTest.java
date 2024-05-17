package POM_DDF_TestNG;

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

public class SwagLoginTest {
	SwagLabsLoginPage log;
	SwagLabsHomePage2 home;
	SwagLabsMenuPage menu;
	Sheet sh ;
	WebDriver driver;
	@BeforeClass
public void OpenBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 log = new SwagLabsLoginPage(driver);
		 home = new SwagLabsHomePage2(driver);
		 menu = new SwagLabsMenuPage(driver);
	
}
	@BeforeMethod
	public void LoginToApp() {
		log.SwagLabsLoginPageUN(sh.getRow(2).getCell(1).getStringCellValue());
		log.SwagLabsLoginPagePWD(sh.getRow(2).getCell(2).getStringCellValue());
		log.SwagLabsLoginPageButton();
		
	}
	@Test
	public void ToVerifyTitle() {
		String actTitle=home.getSwagLabsTitle();
		String ExpTitle=sh.getRow(2).getCell(0).getStringCellValue();
		Assert.assertEquals(actTitle, ExpTitle,"Failed:Both Result  are Failed");
		//home.SwagLabsHomePageTitle(sh.getRow(2).getCell(0).getStringCellValue());
		
		
	}
	@AfterMethod
	public void LogOutApp() {
		home.SwagLabsHomePageMenu();
		menu.SwagLabsMenuPagelick();
		
	}
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		
	}
}

