package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	
 WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
 userName.sendKeys("abcde");
 userName.clear();
 
 
 Thread.sleep(500);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anuradha08");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	WebElement xyz = driver.findElement(By.xpath("//button[@value='1']"));
	String abc = xyz.getText();
	System.out.println(abc);
	
	
	
	
}
}
