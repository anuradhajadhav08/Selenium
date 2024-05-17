package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WithDDF_1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	
	
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	//ENTER USER NAME
	String UName = sh.getRow(2).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UName);
	Thread.sleep(2000);
	
	//ENTER PASSWORD
	String password = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	Thread.sleep(2000);
	
	//CLICK ON LOGIN BUTTON
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String actText=driver.getTitle();
	String Exptext=sh.getRow(2).getCell(0).getStringCellValue();
	
	if(actText.equals(Exptext)) {
		System.out.println("TC PASS");
		
	}
	else {
		System.out.println("TC FAIL");
	}
	
	
	}
}

