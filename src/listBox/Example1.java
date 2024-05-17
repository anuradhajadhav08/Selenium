package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://chat.openai.com/");
	WebElement month = driver.findElement(By.xpath(""));
	
	Select dd = new Select(month);
	//dd.selectByIndex();
	
}
}
