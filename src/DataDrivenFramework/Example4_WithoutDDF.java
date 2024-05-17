package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_WithoutDDF {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	String actTitle=driver.getTitle();
	String ExpTitle= "Swag Labs";
	
	if(actTitle.equals(ExpTitle)) {
		System.out.println("Tc Pass");
		
	}
	else {
		System.out.println("Tc Fail");
	}
	
}
}
