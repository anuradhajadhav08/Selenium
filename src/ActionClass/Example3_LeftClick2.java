package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_LeftClick2 {
public static void main(String[] args) throws InterruptedException {
	
	//browser open
	WebDriver driver = new ChromeDriver();
	//open application flipkart
	driver.get("https://www.flipkart.com/");
	//find xpathe of ,mobile
	WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']"));
	
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	
	//act.moveToElement(mobiles).click().perform();
	act.click(mobiles).perform();
	
	//act.moveToElement(mobiles).contextClick().perform();
	
	//act.contextClick(mobiles).perform();
}
}
