package logicalProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example12_Diabled_Notification {
public static void main(String[] args) {
	
	ChromeOptions op = new ChromeOptions();
	
	op.addArguments("--disable-notification");
	
	WebDriver driver= new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
}
}
