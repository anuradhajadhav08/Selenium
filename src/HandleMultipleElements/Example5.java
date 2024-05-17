package HandleMultipleElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {
public static void main(String[] args) {
	WebDriver driver =  new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung  Galaxy M14 5G");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	 
	String review = driver.findElement(By.xpath("((//div[@class='puisg-row'])[1]//span)[14]")).getText();
	 
	 System.out.println(review);
	 
}
}
