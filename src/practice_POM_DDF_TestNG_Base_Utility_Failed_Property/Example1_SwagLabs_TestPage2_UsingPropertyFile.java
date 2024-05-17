package practice_POM_DDF_TestNG_Base_Utility_Failed_Property;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practicePOM_DDF_TestNG.UtilityClass;

public class Example1_SwagLabs_TestPage2_UsingPropertyFile extends BaseClass{
	Example1_SwagLabs_LoginPage log;
	Example1_SwagLabs_HomePage  home;
	Example1_SwagLabs_MenuPage menu;
	Example1_SwagLabs_HomePage1 town;
	
	int TCID;
	
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
	log.SwagLabsLogin(UtilityClass.getDataFromPropertyFile("UN"));	
	log.SwagLabsPWD(UtilityClass.getDataFromPropertyFile("Password"));
	log.SwagLabsLoginButton();
	Thread.sleep(1000);

}
	@Test
public void VerifyAppName() throws InterruptedException, EncryptedDocumentException, IOException {
		TCID=101;
		String ActTitle=town.VerifyTitle();
		String ExpTitle=UtilityClass.getTD(2, 0);
		Assert.assertEquals(ActTitle, ExpTitle);
		//System.out.println(ActTitle);
		
	//home.VerifyTitle(sh.getRow(2).getCell(0).getStringCellValue());
	Thread.sleep(1000);
	
}
//	@Test
//	public void VerifyProdName() throws EncryptedDocumentException, IOException {
//		TCID=102;
//		String actTitle = town.VerifyProductName();
//		String ExpTitle=UtilityClass.getTD(2, 4);
//		Assert.assertEquals(actTitle, ExpTitle);
//	}
	@AfterMethod
public void LogOutApp(ITestResult Result) throws InterruptedException, IOException {
		
		if(Result.getStatus()==ITestResult.FAILURE) {
			UtilityClass.CapturedScreenShort(driver, TCID);
		}
		
		
	home.ClickOnAddToCart();
	Thread.sleep(1000);
	home.ClickMenuButton();
	menu.SwagLabsclickOnLogout();
	Thread.sleep(1000);
}
	@AfterClass
	public void CloseBrowser() {
		
		driver.close();
	}

}
