package Selenium_24th;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_POM_With_DDF4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file= new  FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Example3_POM_With_DDF1 login= new Example3_POM_With_DDF1(driver);
	String log = sh.getRow(2).getCell(1).getStringCellValue();
	login.EnterUN(log);
	Thread.sleep(4000);
	String code = sh.getRow(2).getCell(2).getStringCellValue();
	login.EnterPWD(code);
	Thread.sleep(4000);
	login.Click();
	
	Example3_POM_With_DDF2 home = new Example3_POM_With_DDF2(driver);
	String UR_cart = sh.getRow(2).getCell(0).getStringCellValue();
	System.out.println(UR_cart);
	home.ClickOnAddToCourt();
	Thread.sleep(4000);
	home.ClickOnSymbol();
	
	Example3_POM_With_DDF3 last = new Example3_POM_With_DDF3(driver);
	last.ClickOnRemove();
	Thread.sleep(2000);
	last.ClickOnCheackOut();
}
}
