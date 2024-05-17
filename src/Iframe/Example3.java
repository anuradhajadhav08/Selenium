package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]")).click();
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
}
}
