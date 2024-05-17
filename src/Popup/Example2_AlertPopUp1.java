package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopUp1 {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
	
	
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 Thread.sleep(1000);
	Alert abc = driver.switchTo().alert();
	//abc.accept();
	//abc.dismiss();
	
	String xyz = abc.getText();
	System.out.println(xyz);
	
	abc.accept();
	
	abc.accept();
	}
	
}
