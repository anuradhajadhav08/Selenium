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
import org.openqa.selenium.support.PageFactory;

public class Example1_withDDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Enter UN
	String UNValue = sh.getRow(2).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UNValue);
	//Enter Password
	String pass = sh.getRow(2).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	//Click on Button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	String actTitle = driver.getTitle();
	String expTitle = sh.getRow(2).getCell(0).getStringCellValue();
	if(actTitle.equals(expTitle)) {
		System.out.println("TC PASS");
		
	}
	else{
		System.out.println("TC FAIL");
	}
	driver.close();
	
}
}
