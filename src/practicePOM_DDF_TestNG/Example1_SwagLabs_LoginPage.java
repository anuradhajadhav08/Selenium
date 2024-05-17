package practicePOM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example1_SwagLabs_LoginPage {
	@FindBy(xpath = "//input[@id='user-name']")private WebElement login;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//input[@type='submit']")private WebElement Button;
	
	public Example1_SwagLabs_LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void SwagLabsLogin(String Username) {
		login.sendKeys(Username);
	}
	
	public void SwagLabsPWD(String Password) {
		PWD.sendKeys(Password);
	}
	
	public void SwagLabsLoginButton() {
		Button.click();;
	}
	
}
