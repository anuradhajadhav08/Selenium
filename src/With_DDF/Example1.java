package With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\POM_DDF_EXAMPLE11.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String UName = sh.getRow(2).getCell(1).getStringCellValue();
    driver.findElement(By.xpath(" //input[@type='text']")).sendKeys(UName);
    Thread.sleep(500);
	
	
    String Password = sh.getRow(2).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(500);
	
	//Find Title
	
	String acttitle = driver.getTitle();
	String Exptitle=sh.getRow(2).getCell(1).getStringCellValue();
	if(acttitle.equals(Exptitle)) {
		System.out.println("TC1 Pass");
	}
	else 
	{
		System.out.println("TC1 Fail");
	}
	Thread.sleep(500);
	
	
	
	//Add to Cart
	driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
	Thread.sleep(500);
	
	//Verify Product Name
	String actProductName = driver.getTitle();
	String ExpProductName=sh.getRow(2).getCell(3).getStringCellValue();
	
	if(actProductName.equals(ExpProductName)) {
		System.out.println("TC2 Pass");
	}
	else 
	{
		System.out.println("TC2 Fail");
	}
	Thread.sleep(500);
	
	
	driver.findElement(By.xpath("//span[text()='1']")).click();
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
	Thread.sleep(500);
	
	
	
	
	
	
	



}
}

