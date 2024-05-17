package POM_DDF_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
	
@FindBy(xpath = "//input[@id='user-name']")private WebElement login;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//input[@type='submit']")private WebElement Button;
@FindBy(xpath = "//div[@class='error-message-container error']")private WebElement ErrorMsg;
public SwagLabsLoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
public void SwagLabsLoginPageUN(String Username)
{
	login.sendKeys(Username);
}
public void SwagLabsLoginPagePWD(String Password) 
{
	PWD.sendKeys(Password);
}
public void SwagLabsLoginPageButton()
{
	Button.click();
}
public void ToVerifyErrorMsg(String ExpError)
{
	String actError = ErrorMsg.getText();
	System.out.println(actError);

	if(actError.equals(ExpError)) 
	{
		System.out.println("TC PASS");
	}
	else {
		System.out.println("TC FAIL");
	}
}

}
