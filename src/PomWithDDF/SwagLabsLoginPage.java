package PomWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
	@FindBy(xpath = "//input[@id='user-name']")	private WebElement Username;
	@FindBy(xpath="//input[@name='password']") private  WebElement Password;
	@FindBy(xpath="//input[@id='login-button']") private  WebElement Login;
	WebDriver driver;
	//Step2: variable Intialisation

	public SwagLabsLoginPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this );
	}
	
	
public void UN(String Uname) {
	Username.sendKeys();
	
}
}
