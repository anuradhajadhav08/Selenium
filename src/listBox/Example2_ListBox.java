package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_ListBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	 
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
     WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
     
     
     
     Select s1 = new Select(year);
     Thread.sleep(1000);
     
     s1.selectByValue("2020");
	
	
	
}
}
