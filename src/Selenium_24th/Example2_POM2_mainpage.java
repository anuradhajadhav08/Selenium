package Selenium_24th;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_POM2_mainpage{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Example2_POM1 ABC= new Example2_POM1(driver);
	ABC.EnterUN();
	Thread.sleep(2000);
	ABC.EnterPWD();
	Thread.sleep(2000);
	ABC.Click();
	Thread.sleep(4000);
	Example2_POM2_HomePage PQR=new Example2_POM2_HomePage(driver);
	PQR.ClickOnAddToCourt();
	Thread.sleep(2000);
	PQR.ClickOnSymbol();
	Thread.sleep(4000);
	Example2_POM2_YourCart XYZ = new Example2_POM2_YourCart(driver);
	XYZ.ClickOnRemove();
	Thread.sleep(2000);
	XYZ.ClickOnCheackOut();
	
}
}
