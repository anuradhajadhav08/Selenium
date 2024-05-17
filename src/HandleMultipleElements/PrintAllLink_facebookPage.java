package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink_facebookPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		// driver.get("https://www.facebook.com/");
		driver.get("https://chat.openai.com/");
		 
		  List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		  
		  for(WebElement link:allLinks) {
//			String abc = link.getText();
//			
//			System.out.println(abc);
			  
			  System.out.println(link.getText());
	}
}
}