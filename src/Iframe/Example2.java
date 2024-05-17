package Iframe;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	//driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
	//driver.switchTo().frame("iframeResult");
	driver.switchTo().frame(0);
}
}
