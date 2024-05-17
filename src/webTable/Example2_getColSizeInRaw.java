package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInRaw {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\WebTable.html");
	 int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
	 System.out.println(colsize);
	 
	 System.out.println("--------------------------");
	 String collsize = driver.findElement(By.xpath("//table[@id='1234']")).getText();
	 
	 System.out.println(collsize);
	 
	 System.out.println("--------------------------");
	 
String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
	 
	 System.out.println(text);
	 
}
}
