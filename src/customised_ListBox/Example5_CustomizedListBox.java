package customised_ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_CustomizedListBox {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(month).click().perform();
	
	Thread.sleep(2000);
	//act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.END).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	
}
}
