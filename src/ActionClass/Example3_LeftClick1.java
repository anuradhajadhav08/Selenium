package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_LeftClick1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		
		Actions act = new Actions(driver);
		 //act.moveToElement(sell).click().perform();
		 act.click(sell).perform();
		
	}
}
