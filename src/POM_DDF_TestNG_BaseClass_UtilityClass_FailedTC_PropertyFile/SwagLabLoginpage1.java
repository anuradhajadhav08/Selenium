package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginpage1 {
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login;
	
	
	public SwagLabLoginpage1(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	public void SwagLabLoginpageUN(String username) {
		UN.sendKeys(username);
	}
	public void SwagLabLoginpagePWD(String password) {
		PWD.sendKeys(password);
	}
	public void SwagLabLoginpageBtn() {
		login.click();
	}

}
