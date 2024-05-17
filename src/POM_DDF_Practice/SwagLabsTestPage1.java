package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTestPage1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	SwagLabsLoginPage1 login = new SwagLabsLoginPage1(driver);
	//enter Username
	login.SwagLabsLoginPageUN(sh.getRow(2).getCell(1).getStringCellValue());
	
	//click on login button
	login.SwagLabsLoginPageButton();
	Thread.sleep(2000);
	//verify error message
login.ToVerifyErrorMsg(sh.getRow(2).getCell(3).getStringCellValue());
}
}
