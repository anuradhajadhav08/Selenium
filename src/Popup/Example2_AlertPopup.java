package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//click on submit option
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert s1 = driver.switchTo().alert();
	String text = s1.getText();
	System.out.println(text);
	s1.accept();
	s1.accept();
	//driver.close();
	
	
	
	//swith on alert popoup
//	String text = driver.switchTo().alert().getText();
//	System.out.println(text);
	
	
//	//click on cancel button on alert popup using alert interface dismiss()
	//driver.switchTo().alert().dismiss();
	
	
	//click on ok button on first Alert popup using alertinterface accept()
	//driver.switchTo().alert().accept();
	
	//click on 2nd alert popup
	//driver.switchTo().alert().accept();
	
}
}
