package DataDrivenFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_withoutDDF {
public static void main(String[] args) throws InterruptedException {
	

   WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(2000);
    
    // Enter The Username
    //String UNvalue = sh.getRow(1).getCell(1).getStringCellValue();
    //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UNvalue);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
    Thread.sleep(2000);
    
    //Enter the Password
    //String password = sh.getRow(1).getCell(2).getStringCellValue();
    driver.findElement(By.xpath(" //input[@name='password'] ")).sendKeys("secret_sauce");
    Thread.sleep(2000);
    
    //Click on Login button
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    
    String actTitle = driver.getTitle();
    String ExpTitle="Swag Labs";
    //String ExpTitle = sh.getRow(1).getCell(0).getStringCellValue();
    
    if(actTitle.equals(ExpTitle)) 
    {
    System.out.println("TC Pass");	
    }
    else {
    	System.out.println("TC Fail");
    }
}
}
