package Selenium_24th;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_withDDF1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new  FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\POM_DDF_EXAMPLE1.xlsx");
	Sheet sheet = WorkbookFactory.create(file).getSheet("DDF");
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //login Page: Enter UserName
	String UN = sheet.getRow(2).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UN);
	Thread.sleep(4000);
	//Enter Password
	String PWD = sheet.getRow(2).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(UN);
	//Click on login button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//To Verify Title
	String actTitle = driver.getTitle();
	String ExpTitle = sheet.getRow(2).getCell(0).getStringCellValue();
	if(actTitle.equals(ExpTitle)) {
	System.out.println("TC PASS");	
	}
	else {
		System.out.println("TC FAIL");
	}
	driver.quit();
	
}
}
