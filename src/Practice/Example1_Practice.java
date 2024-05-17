package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Practice {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement abc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//	String xyz = abc.getText();
//	System.out.println(xyz);
//	
	
	System.out.println(abc.getText());
	System.out.println("xyz");
	
}
	
	
}
