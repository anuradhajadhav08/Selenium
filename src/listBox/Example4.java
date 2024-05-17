package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
	
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Thread.sleep(1000);
	
	Select s1 = new Select(month);
	
	//s1.selectByValue("1");
	s1.selectByVisibleText("Jan");
	
	
}
}
