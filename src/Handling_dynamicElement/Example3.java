package Handling_dynamicElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Example3 {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Apple iphone 15");
	
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

String option = driver.findElement(By.xpath("(//div[@class='puisg-row']//span)[22]")).getText();
 
 System.out.println(option);
	
	
	
	
//	List<WebElement> alloption = driver.findElements(By.xpath("(//div[@class='puisg-row']//span)[22]"));
//	for(WebElement option:alloption) {
//		
//		String s1 = option.getText();
//		System.out.println(s1);
//		
//	}
	
	}
}
