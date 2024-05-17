package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_HiddenDivisionPopUp2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();// browser opened
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();//login
	
	//driver.findElement(By.xpath("//span[text()='Sign Up']")).click();//signup
	Thread.sleep(500);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9678987567");
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	
	}	

}
