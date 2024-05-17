package Handling_dynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
//always change xpath of element
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Enter the input
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung m14");
	
	
	//Click on search Button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String text = driver.findElement(By.xpath("((//div[@class ='puisg-row'])[1]//span)[16]")).getText();
	System.out.println(text);
	
	}	
}
