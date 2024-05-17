package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Redmi");
	Thread.sleep(1000);
	 String expText="Redmi note 13";
	 
	 
	 List<WebElement> allOption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	 
	 
	 for(WebElement option:allOption) {//all option covert into single text
		 String actText = option.getText();//we get here single text
		 
		 //here is comparing exptext and actual text
		 if(actText.equals(expText)) {
			option.click(); 
			break;
		 }
	 }
}
}
