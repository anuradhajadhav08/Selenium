package DDF_POM_TestNG_BaseClass_UtilityClass;

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

public class SwagLabTest {
	SwagLabLoginpage login;
	SwagLabHomepage home ;
	SwagLabMenupage menu ;
	WebDriver driver;
	Sheet sh; 
	
	@BeforeClass
 public void OpenBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE1.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 login=new SwagLabLoginpage(driver);
		 home = new SwagLabHomepage(driver);
		 menu = new  SwagLabMenupage(driver);
		
	
}
	@BeforeMethod
 public void loginToApp() throws InterruptedException {
		
	login.SwagLabLoginpageUN(sh.getRow(2).getCell(1).getStringCellValue());
	Thread.sleep(1000);
	login.SwagLabLoginpagePWD(sh.getRow(2).getCell(2).getStringCellValue());
	Thread.sleep(1000);
	login.SwagLabLoginpageBtn();
	Thread.sleep(1000);
}
	@Test
 public void VerifyTitle() {
		String actTile = home.getSwagLabHomePageTitle();
		String ExpTitle=sh.getRow(2).getCell(0).getStringCellValue();
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
 public void CloseBrowser() {
		driver.quit();
 }
}

