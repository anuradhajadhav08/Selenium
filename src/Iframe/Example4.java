package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
  
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		
		
		driver.switchTo().frame("iframeResult");//id
		
		driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
		
		
		
		
		
		
	}
}
