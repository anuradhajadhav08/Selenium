package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwagLabsLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\Example.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");

Example2_SwagLabsLoginPage login = new Example2_SwagLabsLoginPage(driver);
//String username = sh.getRow(2).getCell(1).getStringCellValue();
//login.UN(username);

login.UN(sh.getRow(2).getCell(1).getStringCellValue());

String password = sh.getRow(2).getCell(2).getStringCellValue();
login.Pass(password);
login.clickOnButton();
	
}
}
