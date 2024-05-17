package Handling_dynamicElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter the input
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung m14");
		
		
		//Click on search Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
	 String alloption = driver.findElement(By.xpath("((//div[@class='puisg-row'])[1]//span)[24]")).getText();
	 System.out.println(alloption);
	
//	for( WebElement option:alloption) {
//		String print = option.getText();
//		System.out.println(print);
//	}
	
}
}
