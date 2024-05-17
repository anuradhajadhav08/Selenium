package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_DoubleClick {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(DoubleClick).doubleClick().perform();
	
}
}
