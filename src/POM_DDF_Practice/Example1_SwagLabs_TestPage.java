package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwagLabs_TestPage {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	Example1_SwagLabs_LoginPage log= new Example1_SwagLabs_LoginPage(driver);
	log.SwagLabsLogin(sh.getRow(2).getCell(1).getStringCellValue());
	Thread.sleep(1000);
	log.SwagLabsPWD(sh.getRow(2).getCell(2).getStringCellValue());
	log.SwagLabsLoginButton();
	Thread.sleep(1000);
	
	
	
	Example1_SwagLabs_HomePage home= new Example1_SwagLabs_HomePage(driver);
	home.VerifyTitle(sh.getRow(2).getCell(0).getStringCellValue());
	home.ClickOnAddToCart();
	home.ClickMenuButton();
	Thread.sleep(1000);

	
	
	Example1_SwagLabs_MenuPage menu = new Example1_SwagLabs_MenuPage(driver);
	menu.SwagLabsclickOnLogout();
	
	driver.close();
			
}
}
