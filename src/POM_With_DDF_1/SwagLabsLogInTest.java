package POM_With_DDF_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLogInTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example111.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/inventory.html");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	SwagLabsLoginPage login = new SwagLabsLoginPage(driver);
	String UNvalue = sh.getRow(1).getCell(1).getStringCellValue();
	login.EnterUN(UNvalue);
	String password = sh.getRow(1).getCell(2).getStringCellValue();
	login.EnterPassword(password);
	Thread.sleep(2000);
	login.ClickOnButton();
	Thread.sleep(2000);
	
	SwagLabsHomePage home = new SwagLabsHomePage(driver);
	home.ClickOnAddToCart();
	Thread.sleep(2000);
	String Title = sh.getRow(1).getCell(0).getStringCellValue();
	home.VerifyHomePageTitle(Title);
	 String Product = sh.getRow(1).getCell(4).getStringCellValue();
	home.ToVerifyPN(Product);
	home.ClickOnMenuButton();
	Thread.sleep(2000);
	
	
	SwagLabsMenuPage menu = new SwagLabsMenuPage(driver);
	Thread.sleep(2000);
	menu.ClickOnLogout();
	
	
	driver.close();
}
}
