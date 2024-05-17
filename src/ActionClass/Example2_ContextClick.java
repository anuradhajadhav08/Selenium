package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_ContextClick {
  public static void main(String[] args) {
	
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  
	WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
	
	Actions act = new Actions(driver);
	
	//act.moveToElement(sell).contextClick().perform();
	//act.contextClick(sell).build().perform();
	act.contextClick(sell).perform();
	
}
}
