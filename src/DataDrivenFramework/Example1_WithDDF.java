package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example1_WithDDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example111.xlsx");
	
    Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
    
   WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(2000);
    
    // Enter The Username
    String UNvalue = sh.getRow(1).getCell(1).getStringCellValue();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UNvalue);
    Thread.sleep(2000);
    
    //Enter the Password
    String password = sh.getRow(1).getCell(2).getStringCellValue();
    driver.findElement(By.xpath(" //input[@name='password'] ")).sendKeys(password);
    Thread.sleep(2000);
    
    //Click on Login button
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    
    String actTitle = driver.getTitle();
    String ExpTitle = sh.getRow(1).getCell(0).getStringCellValue();
    
    if(actTitle.equals(ExpTitle)) 
    {
    System.out.println("TC Pass");	
    }
    else {
    	System.out.println("TC Fail");
    }
}
}
