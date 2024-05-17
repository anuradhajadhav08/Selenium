package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_MouseRightClick {
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions act = new Actions(driver);
	
	//act.moveToElement(mobile).contextClick().  perform();
	
	act.contextClick(mobile).perform();
}
}
