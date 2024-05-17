package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver. get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	SwagLabsLoginPagee login = new SwagLabsLoginPagee(driver);
	login.UN();
	Thread.sleep(2000);
	login.pass();
	Thread.sleep(2000);
	login.Button();
	login.ToVerifyTitleName();
	
	
	SwagLabsHomePage home = new SwagLabsHomePage(driver);
	Thread.sleep(2000);
	home.MenuButton();
	Thread.sleep(2000);
	home.ToVerifyProductName();
	
	SwagLabsMenuPage out = new SwagLabsMenuPage(driver);
	out.logoutbutton();
	

}
}