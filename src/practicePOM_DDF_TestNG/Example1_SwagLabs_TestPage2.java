package practicePOM_DDF_TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1_SwagLabs_TestPage2 extends BaseClass{
	Example1_SwagLabs_LoginPage log;
	Example1_SwagLabs_HomePage  home;
	Example1_SwagLabs_MenuPage menu;
	Example1_SwagLabs_HomePage1 town;
	
	//Sheet sh;
	
	//WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException {
//		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE1.xlsx");
//		 sh = WorkbookFactory.create(file).getSheet("DDF");
//		 
		IntializeBrowser();
		
//	    driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
		 log = new Example1_SwagLabs_LoginPage(driver);
		 home = new Example1_SwagLabs_HomePage(driver);
		 menu = new Example1_SwagLabs_MenuPage(driver);
		 town = new Example1_SwagLabs_HomePage1(driver);
		
	}
	@BeforeMethod
public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
	log.SwagLabsLogin(UtilityClass.getTD(2, 1));	
	log.SwagLabsPWD(UtilityClass.getTD(2, 2));
	log.SwagLabsLoginButton();
	Thread.sleep(1000);

}
	@Test
public void VerifyAppName() throws InterruptedException, EncryptedDocumentException, IOException {
		String ActTitle=town.VerifyTitle();
		String ExpTitle=UtilityClass.getTD(2, 0);
		Assert.assertEquals(ActTitle, ExpTitle);
		//System.out.println(ActTitle);
		
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
