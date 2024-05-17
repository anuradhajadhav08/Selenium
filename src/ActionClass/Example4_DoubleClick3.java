package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_DoubleClick3 {
	public static void main(String[] args) {
		
	
 WebDriver driver = new ChromeDriver();
 
 
 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
 
 WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
 
 Actions act = new Actions(driver);
 
 
 act.doubleClick(DoubleClick).perform();
}
}