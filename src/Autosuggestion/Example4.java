package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung ");
	  Thread.sleep(100);
	  
	  String ExpTitle="samsung s20";
			  
	List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
	  
	for(WebElement option:alloption) 
	{
		String acttext = option.getText();
		
		if(acttext.equals(ExpTitle)) 
		{
			option.click();
			break;
		}
	}
}
}
;