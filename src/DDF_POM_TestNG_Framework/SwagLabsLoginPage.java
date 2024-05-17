package DDF_POM_TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
@FindBy(xpath = "//input[@type='text']")private WebElement UN;
@FindBy(xpath = "//input[@name='password']")private WebElement Password;
@FindBy(xpath = "//input[@type='submit']")private WebElement ClickOnLogin;
public SwagLabsLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void EnterUN(String UNvalue) {
	UN.sendKeys(UNvalue);
}
public void EnterPassword(String Pass) {
	Password.sendKeys(Pass);
}
public void ClickOnButton() {
	ClickOnLogin.click();
}
}
