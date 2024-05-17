package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_DropDown {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();//open browser
	 driver.get("https://www.flipkart.com/");
	 
	 WebElement login = driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.moveToElement(login).perform();
	 
	 driver.findElement(By.xpath("//li[text()='My Profile']")).click();
			
}
}
