package DDF_POM_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginpage {
@FindBy(xpath = "//input[@id='user-name']")private WebElement UN;
@FindBy(xpath = "//input[@name='password']")private WebElement PWD;
@FindBy(xpath = "//input[@id='login-button']")private WebElement login;
public SwagLabLoginpage(WebDriver driver) {
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
