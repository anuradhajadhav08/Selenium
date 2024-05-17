package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_HandlingOfDropDown1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	
	 WebElement AccAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	 
	 Actions act = new Actions(driver);
	 
	 act.moveToElement(AccAndList).perform();
	 
	 driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
}
}
