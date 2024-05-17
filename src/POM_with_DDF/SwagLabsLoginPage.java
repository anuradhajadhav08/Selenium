package POM_with_DDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
@FindBy(xpath = "//input[@id='user-name']")private WebElement login;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//input[@type='submit']")private WebElement Button;
public SwagLabsLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void SwagLabsLoginPageUN(String Username) {
	login.sendKeys(Username);
}
public void SwagLabsLoginPagePWD(String Password) {
	PWD.sendKeys(Password);
}
public void SwagLabsLoginPageButton() {
	Button.click();
}

}
