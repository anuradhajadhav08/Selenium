package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest_1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("DDF");
		
		
		WebDriver driver = new ChromeDriver();
		driver. get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabsLoginPagee_1 login = new SwagLabsLoginPagee_1(driver);
		login.UN(sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		sheet.getRow(0).getCell(0).getStringCellValue();
		login.pass(sheet.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		login.Button();
		login.ToVerifyTitleName(sheet.getRow(2).getCell(0).getStringCellValue());
		
		
		SwagLabsHomePage_1 home = new SwagLabsHomePage_1(driver);
		Thread.sleep(2000);
		home.MenuButton();
		Thread.sleep(2000);
		home.ToVerifyProductName(sheet.getRow(2).getCell(4).getStringCellValue());
		
		SwagLabsMenuPage_1 out = new SwagLabsMenuPage_1(driver);
		out.logoutbutton();
		

	}

}
