package Selenium_24th;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Example4_POM_With_TESTYTNG1 {
	int a;
	Example3_POM_With_DDF1 login;
	Example3_POM_With_DDF2 home1;
	Example3_POM_With_DDF3 last1;
	WebDriver driver;
	Sheet sh;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream file= new  FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE1.xlsx");
	 sh = WorkbookFactory.create(file).getSheet("DDF");
	 driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	login = new Example3_POM_With_DDF1(driver); 
	home1 = new Example3_POM_With_DDF2(driver);
	last1 = new Example3_POM_With_DDF3(driver);
	}
	@BeforeMethod
	public void loginToPage() throws InterruptedException { 
	login.EnterUN(sh.getRow(2).getCell(1).getStringCellValue());
	Thread.sleep(4000);
	login.EnterPWD(sh.getRow(2).getCell(2).getStringCellValue());
	Thread.sleep(4000);
	login.Click();
	}
	@Test
	public void ToVerifyPageTitle() {
		
		home1.ClickOnAddToCourt();
		home1.ClickOnSymbol();
	}
	
	@Test
	public void AddToCartFromPage() throws InterruptedException {
	
	last1.ClickOnRemove();
	Thread.sleep(2000);
	last1.ClickOnCheackOut();
}
	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}
}
 
