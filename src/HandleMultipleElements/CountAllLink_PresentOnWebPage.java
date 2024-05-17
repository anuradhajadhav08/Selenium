package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllLink_PresentOnWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 
		 
//		int link = alllinks.size();
//		
//		System.out.println(link);
		 
		 System.out.println(alllinks.size());
		 
		 for(WebElement link:alllinks) {
//				String abc = link.getText();
//				
//				System.out.println(abc);
				  
				  System.out.println(link.getText());
		}
//		
		
	}
}
