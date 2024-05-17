package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_SelectMultipleCheckBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/ASUS/Desktop/Anuradha/GitHub/HandlingMultipleElements.html");
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement box:checkboxes) {
		box.click();
		Thread.sleep(500);
	}
	for(int i=checkboxes.size()-1;i>=0;i--) {
		checkboxes.get(i).click();
		Thread.sleep(500);
	}
}
}
