package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDeselectMutipleElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\HandlingMultipleElements.html");
		 List<WebElement> allcheackBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=allcheackBox.size()-1;i>=0;i--) {
			allcheackBox.get(i).click();
			Thread.sleep(100);
		}
		
		
	}
}
