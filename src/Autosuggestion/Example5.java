package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver. get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	
	String expText= "Redmi Note 10";
	
	List<WebElement> MultipleElement = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	for(WebElement SingleElements:MultipleElement) {
		
		String actText = SingleElements.getText();
		
		if(actText.equalsIgnoreCase(expText)) {
			SingleElements.click();
			break;
			
			
			
		}
	}
}
}

