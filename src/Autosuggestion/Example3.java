package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	
	Thread.sleep(500);
	
	String Exptext="redmi note 13";
	
	List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	for(WebElement option:alloption) {
		
		String acttext = option.getText();
		//System.out.println(acttext);
		
		if(acttext.equals(Exptext)) 
		{
			option.click();
			break;
		}
	}
	
}
}
