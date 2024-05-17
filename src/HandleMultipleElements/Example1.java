package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	
	for (WebElement links:allLinks) {
		System.out.println(links.getText());
	}
}
}
