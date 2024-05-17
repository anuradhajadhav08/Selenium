package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_withDDF_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		//username passed
//		String username = sh.getRow(2).getCell(1).getStringCellValue();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sh.getRow(2).getCell(1).getStringCellValue());

		Thread.sleep(2000);
		
		//password passed
//		String password = sh.getRow(2).getCell(2).getStringCellValue();
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(2).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String actTitle = driver.getTitle();
		
		String expTitle = sh.getRow(2).getCell(0).getStringCellValue();
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Tc Pass");
			
		}
		else {
			System.out.println("Tc Fail");
		}
	}
}
