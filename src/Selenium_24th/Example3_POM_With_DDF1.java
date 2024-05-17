package Selenium_24th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example3_POM_With_DDF1 {

	@FindBy(xpath = "//input[@id='user-name']") private  WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private  WebElement PWD;
	@FindBy(xpath = "//input[@type='submit']") private  WebElement Button;
	//step 1:Intialization
	public Example3_POM_With_DDF1(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	public void EnterUN(String UserName) {
		UN.sendKeys("standard_user");
	}
	public void EnterPWD(String password) {
		PWD.sendKeys("secret_sauce");
	}
	public void Click() {
		Button.click();
	}




}
