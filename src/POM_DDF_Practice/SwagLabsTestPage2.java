package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTestPage2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/");
	
	SwagLabsLoginPage log = new SwagLabsLoginPage(driver);
	log.SwagLabsLoginPageUN(sh.getRow(2).getCell(1).getStringCellValue());
	log.SwagLabsLoginPagePWD(sh.getRow(2).getCell(2).getStringCellValue());
	Thread.sleep(2000);
	log.SwagLabsLoginPageButton();
	
	SwagLabsHomePage1 home= new SwagLabsHomePage1(driver)	;
	home.ClickOnProduct();
	home.SwagLabsYourcartProductName(sh.getRow(2).getCell(4).getStringCellValue());
	
}
}