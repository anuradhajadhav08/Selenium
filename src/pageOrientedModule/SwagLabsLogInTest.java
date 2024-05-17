package pageOrientedModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLogInTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/inventory.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	SwagLabsLoginPage login = new SwagLabsLoginPage(driver);
	login.EnterUN();
	login.EnterPassword();
	Thread.sleep(2000);
	login.ClickOnButton();
	Thread.sleep(2000);
	
	SwagLabsHomePage home = new SwagLabsHomePage(driver);
	home.ClickOnAddToCart();
	Thread.sleep(2000);
	home.VerifyHomePageTitle();
	home.ToVerifyPN();
	home.ClickOnMenuButton();
	Thread.sleep(2000);
	
	
	SwagLabsMenuPage menu = new SwagLabsMenuPage(driver);
	Thread.sleep(2000);
	menu.ClickOnLogout();
	
	
	driver.close();
}
}
