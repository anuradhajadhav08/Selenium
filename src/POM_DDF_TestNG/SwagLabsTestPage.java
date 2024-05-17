package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTestPage {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\Example.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		SwagLabsLoginPage log = new SwagLabsLoginPage(driver);
		String UserName = sh.getRow(2).getCell(1).getStringCellValue();
		log.SwagLabsLoginPageUN(UserName);
		Thread.sleep(2000);
		String PWD = sh.getRow(2).getCell(2).getStringCellValue();
		log.SwagLabsLoginPagePWD(PWD);
		Thread.sleep(2000);
		log.SwagLabsLoginPageButton();
		
		
		
		SwagLabsHomePage home = new SwagLabsHomePage(driver);
		String Title = sh.getRow(2).getCell(0).getStringCellValue();
		home.SwagLabsHomePageTitle(Title);
		Thread.sleep(2000);
		home.SwagLabsHomePagCart();
		Thread.sleep(2000);
		home.SwagLabsHomePageMenu();
		
		
		
		SwagLabsMenuPage menu = new SwagLabsMenuPage(driver);
		Thread.sleep(2000);
		menu.SwagLabsMenuPagelick();
		
		
		Thread.sleep(3000);
		 driver.quit();
	}
}
