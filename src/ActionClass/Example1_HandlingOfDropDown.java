package ActionClass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_HandlingOfDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Step1
	WebElement AccAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	//Step2
	Actions act = new Actions(driver);
	
	//Step3: Move pointer on acc and list
	act.moveToElement(AccAndList).perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
	
}
}
