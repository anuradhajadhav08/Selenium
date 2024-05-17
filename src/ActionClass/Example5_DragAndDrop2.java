package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_DragAndDrop2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		
		Actions act= new Actions(driver);
		
		act.moveToElement(src).dragAndDrop(src, dest).moveToElement(dest).release().perform();
}
}