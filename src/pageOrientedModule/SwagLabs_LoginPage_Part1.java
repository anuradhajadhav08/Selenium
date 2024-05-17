package pageOrientedModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_LoginPage_Part1 {
	@FindBy(xpath = "//input[@type='text']") WebElement UName;
	@FindBy(xpath = "//input[@name='password']") WebElement Password;
	@FindBy(xpath = "//input[@type='submit']") WebElement ClickOnButton;
	
	public SwagLabs_LoginPage_Part1(WebDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	
	public void UserName() {
		UName.sendKeys("standard_user");
	}
	
	public void Pass() {
		Password.sendKeys("secret_sauce");
	}
	
	public void Button() {
		ClickOnButton.click();
		
	}

}
