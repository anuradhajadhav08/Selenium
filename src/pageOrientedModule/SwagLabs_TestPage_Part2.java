package pageOrientedModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_TestPage_Part2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/inventory.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	SwagLabs_LoginPage_Part1  abc= new SwagLabs_LoginPage_Part1(driver); 
		abc.UserName();
		Thread.sleep(2000);
		abc.Pass();
		Thread.sleep(2000);
		abc.Button();
		
	SwagLabs_HomePage_Part1 xyz = new SwagLabs_HomePage_Part1(driver);
		xyz.Add();
		Thread.sleep(2000);
		xyz.ClickToCart();	
		Thread.sleep(2000);
		xyz.ToVerifyApplicationName();
		xyz.VerifyNameOfProduct();
		Thread.sleep(2000);
		
	SwagLabs_CartPage_Part1 pqr = new SwagLabs_CartPage_Part1(driver);
	    pqr.RemovePoduct();
	    Thread.sleep(2000);
	    driver.close();
		
	
}
}
