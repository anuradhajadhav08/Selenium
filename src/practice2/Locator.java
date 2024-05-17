package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.facebook.com/");//webdriver
	driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
	
	
}
}
